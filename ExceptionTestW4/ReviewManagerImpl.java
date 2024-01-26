package com.ssafy.ws.step4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 리뷰리스트를 배열을 리스트로 변경
 */
public class ReviewManagerImpl implements IReviewManager{
	//코드를 작성해주세요. 
	
	private List<Review> reviews = new LinkedList<>();
	
	private static ReviewManagerImpl rvm = new ReviewManagerImpl();
	
	private ReviewManagerImpl() {}
	
	public static ReviewManagerImpl getInstance() {
		return rvm;
	}
	@Override
	public void addReview(Review review) {
		reviews.add(review);
	}
	
	@Override
	public void removeReview(int reviewId) {
		Iterator<Review> iterator = reviews.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getReviewId() == reviewId) {
				iterator.remove();
				break;
			}
		}
	}
	
	@Override
	public List<Review> getReviewList(){
		return new LinkedList<>(this.reviews);
	}
	
	@Override
	public Review searchByreviewId(int reviewId) {
		for(Review review : reviews) {
			if(review.getReviewId() == reviewId) {
				return review;
			}
		}
		return null;
	}
	
	@Override
	public List<Review> getRestaurantReview(int resId){
		List<Review> restaurantReviews = new LinkedList<>();
		for(Review review : reviews) {
			if (review.getResId() == resId) {
				restaurantReviews.add(review);
			}
		}
		return restaurantReviews;
	}
}
