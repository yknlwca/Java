import java.util.Arrays;

public class Array08_중앙값찾기 {
	public static void main(String[] args) {
		// 홀수개 인 경우;
		int[] arr = { 1, 2, 3, 5, 7, 3, 5, 6, 2, 7, 9, 7, 6, 8, 9, 5, 6, 7, 4 };
		System.out.println(arr.length);
		
		
		int[] count = new int[10];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println(Arrays.toString(count));
		
		// 카운팅 배열로 중앙값 구하기
		// 앞에서부터 개수를 누적해 나가면서 그 개수가 처음으로 중간을 넘어서면, 그 수가 중앙값(median)
		int sum = 0;
		int median = 0;
		for (int i = 1; i <= 9; i++) {
			sum += count[i];
			System.out.println("현재(" + i + ")까지 개수의 합: " + sum);
			if (sum >= (arr.length / 2) + 1) {
				median = i;
				break;
			}
		}
		System.out.println(median);
	}
}
