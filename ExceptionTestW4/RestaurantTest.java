package com.ssafy.ws.step4;

import java.util.List;

/**
 * 인터페이스 분리 및 싱글톤 테스트 클래스
 */
public class RestaurantTest {
	public static void main(String[] args) {
		//코드를 작성해주세요. 
		Restaurant rest1 = new Restaurant(401, "도마29", "대구", "연어초밥", 8);
        Restaurant rest2 = new Restaurant(301, "마포리 1987", "서울", "마포리스테이크", 7);
        Restaurant rest3 = new Restaurant(601, "성심당", "대전", "튀김소보로", 8);
        KoreanRestaurant koRest1 = new KoreanRestaurant(101, "을밀대", "서울", "물냉면", 9, "02-717-1922", "No");
        KoreanRestaurant koRest2 = new KoreanRestaurant(102, "도꼭지", "서울", "도미솥밥", 8, "02-711-0431", "15:00 ~ 17:00");
        
        // 싱글톤 인스턴스 가져오기
        IRestaurantManager rm = RestaurantManagerImpl.getInstance();
        IReviewManager rvm = ReviewManagerImpl.getInstance();
        
        // 리뷰 객체 생성
        Review newReview1 = new Review(1, 101, "김싸피", "너무 맛있네요.");
        Review newReview2 = new Review(2, 101, "이싸피", "깔끔합니다!");
        Review newReview3 = new Review(3, 401, "나싸피", "연어초밥은 여기가 최고!");
        Review newReview4 = new Review(4, 601, "박싸피", "대전오면 성심당 안 갈 수 없죠!");
        

        // RestaurantManagerImpl의 인스턴스 가져오기
        RestaurantManagerImpl manager = RestaurantManagerImpl.getInstance();
        ReviewManagerImpl rmanager = ReviewManagerImpl.getInstance(); 
        // 리뷰 추가
        rmanager.addReview(newReview1);
        rmanager.addReview(newReview2);
        rmanager.addReview(newReview3);
        rmanager.addReview(newReview4);

        // 레스토랑 추가
        rm.addRestaurant(rest1);
        rm.addRestaurant(rest2);
        rm.addRestaurant(rest3);
        rm.addRestaurant(koRest1);
        rm.addRestaurant(koRest2);
		
        System.out.println("***************한식 맛집 목록***************");
        List<KoreanRestaurant> koreanRestaurants = rm.getKoreanRestaurants();
        for (KoreanRestaurant rest : koreanRestaurants) {
            System.out.println(rest);
        }

        System.out.println("***************브레이크 타임이 있는 목록***************");
        for (KoreanRestaurant korest : koreanRestaurants) {
            if (korest.getBreakTime() != null && !korest.getBreakTime().equals("No")) {
                System.out.println(korest);
            }
        }

        System.out.println("***************일반 맛집 목록****************");
        List<Restaurant> nonKoreanRestaurants = rm.getNonKoreanRestaurants();
        for (Restaurant rest : nonKoreanRestaurants) {
            System.out.println(rest);
        }

        System.out.println("***************을밀대 리뷰 목록***************");
        List<Review> reviews = rvm.getReviewList();
        for (Review review : reviews) {
            if (review.getResId() == 101) {
                System.out.println(review);
            }
        }

        System.out.println("***************도마29 리뷰 목록***************");
        for (Review review : reviews) {
            if (review.getResId() == 401) {
                System.out.println(review);
            }
        }

        System.out.println("***************성심당 리뷰 목록***************");
        for (Review review : reviews) {
            if (review.getResId() == 601) {
                System.out.println(review);
            }
        }
		
		
		
		
	}
	

}
