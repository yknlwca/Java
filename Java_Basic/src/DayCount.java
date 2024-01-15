package com.ssafy.hw.step4;

import java.util.*;

public class DayCount {

	public static void main(String[] args) {
		//코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("월과 일을 입력하세요.");
		
		
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int days = 0;
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		for (int i = 0; i < month - 1; i++) {
            days += monthDays[i];
        }
		days += day;
		
		System.out.println(month + "월 " + day + "일은 " + days + "번째 날입니다.");
		
	}

}
