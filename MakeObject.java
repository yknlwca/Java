/**
 * 맛집, 리뷰 객체의 리스트를 배열로 유지하며 관리하는 클래스
 */
public class MakeObject {
	// 코드를 작성해주세요.
	private int MAX_RESTAURANT_SIZE = 0;
	private int MAX_PEVIEW_SIZE = 0;
	private int restaurantSize = 0;
	private int reviewSize = 0;

	Restaurant[] restaurantList = new Restaurant[100];
	Review[] reviewList = new Review[1000];

	public boolean addRestaurant(Restaurant restaurant) {
		if (MAX_RESTAURANT_SIZE < 100) {
			restaurantList[MAX_RESTAURANT_SIZE] = restaurant;
			MAX_RESTAURANT_SIZE++;
			return true;
		} else
			return false;
	}

	public boolean addReview(Review review) {
		if (MAX_PEVIEW_SIZE < 1000) {
			reviewList[MAX_PEVIEW_SIZE] = review;
			MAX_PEVIEW_SIZE++;
			return true;
		} else
			return false;
	}

	public boolean updateRestaurant(Restaurant restaurant) {
		for (int i = 0; i < MAX_RESTAURANT_SIZE; i++) {
			if (restaurantList[i].getAddress().equals(restaurant.getAddress())) {
				restaurantList[i] = restaurant;
				return true;
			}

		}
		return false;

	}

	public boolean removeRestaurant(int resId) {
		for (int i = 0; i < MAX_RESTAURANT_SIZE; i++) {
			if (restaurantList[i].getResId() == resId) {
				for (int j = i; j < MAX_RESTAURANT_SIZE; j++) {
					restaurantList[j] = restaurantList[j + 1];
				}
				restaurantList[MAX_RESTAURANT_SIZE - 1] = null;
				MAX_RESTAURANT_SIZE--;
				return true;
			}
		}
		return false;
	}

	public boolean removeReview(int reviewId) {
		for (int i = 0; i < MAX_PEVIEW_SIZE; i++) {
			if (reviewList[i].getReviewId() == reviewId) {
				for (int j = i; j < MAX_PEVIEW_SIZE; j++) {
					reviewList[j] = reviewList[j + 1];
				}
				reviewList[MAX_PEVIEW_SIZE - 1] = null;
				MAX_PEVIEW_SIZE--;
				return true;
			}
		}
		return false;
	}

	public Restaurant searchByresId(int resId) {
		for (int i = 0; i < MAX_RESTAURANT_SIZE; i++) {
			if (restaurantList[i].getResId() == resId) {
				return new Restaurant[] { restaurantList[i] };
			}
		}
		return null;
	}

	public Restaurant[] getRestaurantList() {
		Restaurant[] result = new Restaurant[MAX_RESTAURANT_SIZE];

		for (int i = 0; i < MAX_RESTAURANT_SIZE; i++) {
			result[i] = restaurantList[i];
		}
		return result;

	}

	public Review[] getRestairantReview(int resId) {
		Review[] result = new Review[MAX_PEVIEW_SIZE];

		for (int i = 0; i < MAX_PEVIEW_SIZE; i++) {
			result[i] = reviewList[i];
		}
		return result;
	}

	public Restaurant getRestaurant(int resId) {
		for (int i = 0; i < MAX_RESTAURANT_SIZE; i++) {
			if (restaurantList[i].getResId() == resId) {
				return restaurantList[i];
			}
		} return null;
	}
}
