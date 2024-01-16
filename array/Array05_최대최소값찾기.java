
public class Array05_최대최소값찾기 {
	public static void main(String[] args) {
		int[] nums = { 13, 56, 1, 99, 85 };

		// 최대 최소값을 찾는 방법
		// 1. 최대값을 담을 변수를 max, 최소값을 저장할 변수는 min으로 선언.
		// max - 주어진 수의 범위보다 작은 수로 초기화
		// min - 주어진 수의 범위보다 큰 수로 초기화

//		int max = 0;
//		int min = 100;

//		int max = Integer.MIN_VALUE; // int형 중에서 제일 작은 값 -21억~
//		int min = Integer.MAX_VALUE; // int형 중에서 제일 큰 값 +21억~
		
		
		// 배열의 가장 첫번째 원소로 초기화;
		int max = nums[0];
		int min = nums[0];
		
		// 2. 주어진 배열의 수를 순회하면서
		for (int i = 0; i < nums.length; i++) {
			// max보다 더 큰 수를 만나면 -> 그 수로 업데이트
			if (nums[i] > max) {
				max = nums[i];
			}

			// min보다 더 작은 수를 만나면 -> 그 수로 업데이트
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
