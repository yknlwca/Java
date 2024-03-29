package com.ssafy.ws.step4;

import java.util.List;

/**
 * 맛집리스트를 관리하기 위한 클래스를 위한 명세역할의 인터페이스
 */
public interface IRestaurantManager {
	//코드를 작성해주세요. 
	void addRestaurant(Restaurant restaurant);
	
	void removeRestaurant(int resId);
	
	List<Restaurant> getRestaurantList();
	
	Restaurant searchByresId(int resId);
	
	List<KoreanRestaurant> getkoreanRestaurants(); 
	
	List<Restaurant> getNonKoreanRestaurants();
	
	IReviewManager getReviewManager(int resId);

	List<KoreanRestaurant> getKoreanRestaurants();

}
