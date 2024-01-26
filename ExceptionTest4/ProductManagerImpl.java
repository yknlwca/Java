package com.ssafy.hw.step4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 상품리스트를 배열로 유지하며 관리하는 클래스
 */
public class ProductManagerImpl implements IProductManager {

	private List<Product> products = new ArrayList<>();

	private Map<String, List<Review>> reviews = new HashMap<>();

	int reviewNo;

	private static ProductManagerImpl instance = new ProductManagerImpl();

	private ProductManagerImpl() {
	}

	public static ProductManagerImpl getInstance() {
		return instance;
	}

	@Override
	public boolean addProduct(Product product) {
		return products.add(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		for (int i = 0; i < products.size(); i++) {
			products.set(i, product);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeProduct(String pCode) throws ProductCodeNotFoundException{
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getpCode().equals(pCode)) {
				products.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public int sell(String pCode, int cnt) throws ProductCodeNotFoundException, QuantityException {
		for (Product product : products) {
			if (product.getpCode().equals(pCode)) {
				if (product.getQuantity() >= cnt) {
					product.setQuantity(product.getQuantity() - cnt);
					return product.getQuantity();
				} else {
					System.out.println("재고 없음");
					return -1;
				}
			}
		}
		System.out.println("해당 상품 없음");
		return -1;
	}

	@Override
	public Product[] getProductList() {
		return products.toArray(new Product[0]);
	}

	@Override
	public boolean addReview(Review review) {
		String pCode = review.getpCode();
		reviews.putIfAbsent(pCode, new ArrayList<>());
		List<Review> reviewList = reviews.get(pCode);
		review.setReviewId(++reviewNo);
		return reviewList.add(review);
	}

	@Override
	public boolean removeReview(Review review) throws ReviewNotFoundException {
		for(List<Review> reviewList : reviews.values()) {
			if (reviewList.removeIf(r -> r.getReviewId() == review.getReviewId())) {
				return true;
			}
		}return false;
	}

	@Override
	public List<Review> getProductReview(String pCode) throws ProductCodeNotFoundException {
		return reviews.getOrDefault(pCode, new ArrayList<>());
	}

	@Override
	public Product[] searchByName(String name) throws NameNotFoundException{
		List<Product> list = new ArrayList<>();

		for (Product pro : products) {
			if (pro.getpName().contains(name)) {
				list.add(pro);
			}
		}
		if (list.size() == 0)
			return null;

		Product[] result = new Product[list.size()];
		return list.toArray(result);

	}

	@Override
	public long getTotalPrice() {
		long sum = 0L;
		for (Product pro : products) {
			sum += pro.getPrice();
		}
		return sum;
	}

	@Override
	public Product[] getProducts() {
		List<Product> list = new ArrayList<>();
		for (Product pro : products) {
			if (!(pro instanceof Refrigerator)) {
				list.add(pro);
			}
		}
		Product[] result = new Product[list.size()];
		return list.toArray(result);
	}

	@Override
	public Refrigerator[] getRefrigerators() {
		List<Product> list = new ArrayList<>();
		for (Product pro : products) {
			if (pro instanceof Refrigerator) {
				list.add(pro);
			}
		}
		Refrigerator[] result = new Refrigerator[list.size()];
		return list.toArray(result);
	}

	@Override
	public Refrigerator[] getRefrigeratorsFreezer(boolean freezer) {
		List<Product> list = new ArrayList<>();
		for (Product pro : products) {
			if (pro instanceof Refrigerator && ((Refrigerator) pro).isFreezer() == freezer) {
				list.add(pro);
			}
		}
		Refrigerator[] result = new Refrigerator[list.size()];
		return list.toArray(result);
	}
}
