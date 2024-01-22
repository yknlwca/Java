package Restaurant;

import java.util.Arrays;

import javax.print.DocFlavor.READER;

/**
 * 맛집, 리뷰 객체의 리스트를 배열로 유지하며 관리하는 클래스
 */
public class RestaurantManager {
	// 코드를 작성해주세요.

	public int MAX_RESTAURANT_SIZE = 100;
	public int MAX_REVIEW_SIZE = 100;
	public Restaurant[] restaurants = new Restaurant[MAX_RESTAURANT_SIZE];
	public Review[] reviews = new Review[MAX_REVIEW_SIZE];
	public int restaurantSize;
	public int reviewSize;

	public KoreanRestaurant[] getKoreanRestaurantList() {
		int cnt = 0;
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i] instanceof KoreanRestaurant) {
				cnt++;
			}
		}if (cnt == 0) {
			return null;
		}
		
		KoreanRestaurant[] result = new KoreanRestaurant[cnt];
		
		for(int i = 0, index = 0; i < restaurantSize; i++) {
			if(restaurants[i] instanceof KoreanRestaurant) {
				result[index++] = (KoreanRestaurant) restaurants[i];
			}
		}
		return result;
	}
	
		

	public Restaurant[] getNonKoreanRestaurants() {
		int cnt = 0;
		for (int i = 0; i < restaurantSize; i++) {
			if (!(restaurants[i] instanceof KoreanRestaurant)) {
				cnt++;
			}
		}if (cnt == 0) return null;
		
		Restaurant[] result = new Restaurant[cnt];
		
		for(int i = 0, index = 0; i < restaurantSize; i++) {
			if(!(restaurants[i] instanceof KoreanRestaurant)) {
				result[index++] = restaurants[i];
			}
		}return result;
	}

	public void addRestaurant(Restaurant restaurant) {
		if (restaurantSize < MAX_RESTAURANT_SIZE) {
			restaurants[restaurantSize++] = restaurant;
		} else {
			System.out.println("등록 불가");
		}
	}

	public void addReview(Review review) {
		if (reviewSize < MAX_REVIEW_SIZE) {
			reviews[reviewSize++] = review;
		} else {
			System.out.println("등록 불가");
		}
	}

	public void removeRestaurant(int resId) {
		for (int i = 0; i < restaurantSize; i++) {
			if (restaurants[i].getResId() == resId) {
				for (int j = i; j < restaurantSize; j++) {
					restaurants[j] = restaurants[j + 1];
				}
				restaurants[restaurantSize - 1] = null;
				restaurantSize--;
			}
		}
	}

	public void removeComment(int reviewId) {
		for (int i = 0; i < reviewSize; i++) {
			if (reviews[i].getReviewId() == reviewId) {
				for (int j = i; j < reviewSize; j++) {
					reviews[j] = reviews[j + 1];
				}
				reviews[reviewSize - 1] = null;
				reviewSize--;
			}
		}
	}

	public Restaurant[] getRestaurantList() {
		return Arrays.copyOfRange(restaurants, 0, restaurantSize);
	}

	public Review[] getReviewList() {
		Review[] result = new Review[reviewSize];
		for (int i = 0 ; i < reviewSize; i++) {
			result[i] = reviews[i];
		}return result;
	}

	public Restaurant getRestaurant(int resId) {
		for(int i = 0; i < restaurantSize; i++) {
			if (restaurants[i].getResId() == resId) 
				return restaurants[i];
		}return null;
	}

	public Review getReview(int reviewId) {
		for(int i = 0; i < reviewSize; i++) {
			if(reviews[i].getReviewId() == reviewId) 
				return reviews[i];
		}return null;
	}
}
