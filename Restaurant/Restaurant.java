package Restaurant;

/**
 * 맛집 정보를 나타내는 클래스
 */
public class Restaurant {
	//코드를 작성해주세요. 
	
	public int resId;
	public String name;
	public String address;
	public String signatureMenu;
	public int rate;
	
	public Restaurant() {}

	public Restaurant(int resId, String name, String address, String signatureMenu, int rate) {
		super();
		this.resId = resId;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Restaurant [resId=" + resId + ", name=" + name + ", address=" + address + ", signatureMenu="
				+ signatureMenu + ", rate=" + rate + "]";
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSignatureMenu() {
		return signatureMenu;
	}

	public void setSignatureMenu(String signatureMenu) {
		this.signatureMenu = signatureMenu;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
}
