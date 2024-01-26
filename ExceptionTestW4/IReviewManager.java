package com.ssafy.ws.step4;

import java.util.List;

/**
 * 리뷰리스트를 관리하기 위한 클래스를 위한 명세역할의 인터페이스
 */
public interface IReviewManager {
	//코드를 작성해주세요. 
	void addReview(Review reivew);
	
	void removeReview(int reviewId);
	
	List<Review> getReviewList();
	
	Review searchByreviewId(int reviewId);
	
	List<Review> getRestaurantReview(int resId);
}
