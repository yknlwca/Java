package com.ssafy.hw.step4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 상품 객체를 생성하고 출력하는 클래스
 *
 */
public class ProductTest {
	public static void main(String[] args) {
		// 코드를 작성하세요.

		Refrigerator refrigerator1 = new Refrigerator("R0001", "S냉장고", 1000000, 20, "삼성", "삼성에서 출시한 스마트 냉장고 입니다.",
				"냉장고", 1000, true, 2021);
		Refrigerator refrigerator2 = new Refrigerator("R0002", "L냉장고", 100000, 10, "앨리스", "앨리스 저가형 냉장고", "냉장고", 3000,
				false, 2022);
		Refrigerator refrigerator3 = new Refrigerator("R0003", "T냉장고", 3000000, 200, "로보", "로보에서 출시한 AI냉장고입니다.", "냉장고",
				1200, true, 2022);
		Refrigerator refrigerator4 = new Refrigerator("R0004", "K냉장고", 500000, 50, "코리", "코리에서 출시한 보급형냉장고입니다.", "냉장고",
				700, false, 2021);
		Refrigerator refrigerator5 = new Refrigerator("R0005", "A냉장고", 1000000, 10, "에이스", "에이스에서 출시한 스마트냉장고입니다.",
				"냉장고", 800, true, 2022);
		Product product1 = new Product("P00001", "우주폰S", 500000, 100, "삼성", "삼성에서 출시한 우주폰S입니다.");

		IProductManager pm = ProductManagerImpl.getInstance();

		pm.addProduct(refrigerator1);
		pm.addProduct(refrigerator2);
		pm.addProduct(refrigerator3);
		pm.addProduct(refrigerator4);
		pm.addProduct(refrigerator5);
		pm.addProduct(product1);

//		System.out.println("***************냉장고 목록***************");
//		List<Refrigerator> refrigerators = Arrays.asList(pm.getRefrigerators());
//		for (Refrigerator ref : refrigerators) {
//			System.out.println(ref);
//		}
//
//		System.out.println("***************냉동고 있는 목록***************");
//		List<Refrigerator> freezerRefrigerators = Arrays.asList(pm.getRefrigeratorsFreezer(true));
//		for (Refrigerator ref : freezerRefrigerators) {
//			System.out.println(ref);
//		}

		System.out.println("*************이름에 'X'가 포함된 상품 검색**************");
		Product[] sProduct = null;
		try {
		    sProduct = pm.searchByName("X");
		    
		} catch (NameNotFoundException e) {
		    System.out.println(e.getMessage());
		}

		
		
		
	}
}
