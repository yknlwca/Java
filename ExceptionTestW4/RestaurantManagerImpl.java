package com.ssafy.ws.step4;

import java.lang.reflect.Array;
import java.util.*;

import javax.print.DocFlavor.READER;

import com.ssafy.ws.step3.Restaurant;

/**
 * 맛집리스트를 배열로 유지하며 관리하는 클래스
 */
public class RestaurantManagerImpl implements IRestaurantManager {
	// 코드를 작성해주세요.

	private List<Restaurant> restaurants = new LinkedList<>();

	private Map<Integer, IReviewManager> rvm = new HashMap<>();

	private IReviewManager ReviewManagerImpl;

	private static RestaurantManagerImpl instance = new RestaurantManagerImpl();

	private RestaurantManagerImpl() {
	}

	public static RestaurantManagerImpl getInstance() {
		return instance;
	}

	@Override
	public List<KoreanRestaurant> getKoreanRestaurants() {

		List<KoreanRestaurant> list = new LinkedList<>();
		for (Restaurant restaurant : restaurants) {
			if (restaurant instanceof KoreanRestaurant) {
				list.add((KoreanRestaurant) restaurant);
			}
		}
		return list;
	}

	@Override
	public List<Restaurant> getNonKoreanRestaurants() {

		List<Restaurant> list = new LinkedList<>();
		for (Restaurant restaurant : restaurants) {
			if (!(restaurant instanceof KoreanRestaurant)) {
				list.add(restaurant);
			}
		}
		return list;
	}

	@Override
	public List<Restaurant> getRestaurantList() {

//		return new LinkedList<>(this.restaurants);
		
		List<Restaurant> list = new ArrayList<>();
		for(int i = 0 ; i < restaurants.size(); i++) {
			list.add(restaurants.get(i));
		}
		return list;
	}

	
	@Override
	public Restaurant searchByresId(int resId)  {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getResId() == resId) {
				return restaurant;
			}
		}
		return null;
	}

	@Override
	public void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
		rvm.put(restaurant.getResId(), ReviewManagerImpl);
	}

	@Override
	public void removeRestaurant(int resId) {
//		Iterator<Restaurant> iterator = restaurants.iterator();
//		while(iterator.hasNext()){
//			if(iterator.next().getResId() == resId) {
//				iterator.remove();
//				break;
//			}
//		}
		for (int i = 0; i < restaurants.size(); i++) {
			if(restaurants.get(i).getResId() == resId) {
				restaurants.remove(i);
			}
		}
	}

	public IReviewManager getReviewManager(int resId) {
		return rvm.get(resId);
	}

	@Override
	public List<KoreanRestaurant> getkoreanRestaurants() {
		
		return null;
	}
}