import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] nums = { 13, 56, 1, 99, 85 };

		for (int i = 0; i < nums.length; i++) {
			nums[i] *= 2;
			System.out.println(nums[i]);
		}

		// for-each문
		// for (자료형 변수명 : 배열(반복할 수 있는 것)) { }
		
		for (int num : nums) {
//			System.out.println(num);
			num *= 2;
		}
		// ONLY READ
		for (int num : nums) {
			System.out.println(num);
		}
		
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
	}
}
