import java.util.Arrays;

public class Array06_구간합구하기 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int N = 5;
		int M = 9; // index

		// 1. 반복문을 N~M까지 돌면서 합을 구한다.
		int sum = 0;
		for (int i = N; i <= M; i++) {
			sum += arr[i];
		}

		System.out.println("sum: " + sum);

		// 2. A : 0 ~ M까지의 합을 구한 후
		// B : 0 ~ (N-1)까지의 합을 구한후
		// A - B : N ~ M
		int A = 0;
		int B = 0;
		for (int i = 0; i <= M; i++) {
			A += arr[i];
		}
		for (int i = 0; i <= N - 1; i++) {
			B += arr[i];
		}
		System.out.println("sum: " + (A - B));

		// 3. prefixSum을 구한 후
		// 이미 구해져 있는 합을 이용
		int[] prefixSum = new int[arr.length]; // 원본 배열과 똑같은 크기로 만든다.
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];

		}
		System.out.println(Arrays.toString(prefixSum));
		System.out.println("sum: " + (prefixSum[M] - prefixSum[N - 1])); // N >= 1일 때만 가능.

		int sum2 = 0;
		if (N == 0) {
			sum2 = prefixSum[M];
		} else {
			sum2 = prefixSum[M] - prefixSum[N - 1];
		}
		System.out.println("sum: " + sum2);
	}

}
