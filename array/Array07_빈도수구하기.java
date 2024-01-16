import java.util.Arrays;

public class Array07_빈도수구하기 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 7, 3, 5, 6, 2, 7, 9, 7, 6, 8, 9, 5, 6, 7, 4 };
		
		
		// 제일 큰 수 +1의 크기로 만든다.
		int[] count = new int[10];
		
		for (int i = 0; i <arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println(Arrays.toString(count));
	}
}
