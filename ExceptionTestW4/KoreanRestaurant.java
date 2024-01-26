package com.ssafy.ws.step4;

/**
 * 한식 맛집 정보를 나타내는 클래스
 */
public class KoreanRestaurant extends Restaurant{
	//코드를 작성해주세요. 
	
	
	public String number;
	public String breakTime;
	
	public KoreanRestaurant() {
		// TODO Auto-generated constructor stub
	}

	public KoreanRestaurant(int resId, String name, String address, String signatureMenu, int rate, String number,
			String breakTime) {
		super(resId, name, address, signatureMenu, rate);
		this.number = number;
		this.breakTime = breakTime;
	}

	@Override
	public String toString() {
		return "KoreanRestaurant [resId=" + resId + ", name=" + name + ", address=" + address + ", signatureMenu="
				+ signatureMenu + ", rate=" + rate + ", number=" + number + ", breakTime=" + breakTime + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}
}
