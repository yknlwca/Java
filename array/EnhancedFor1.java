package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
//        향상된 for문 for-each문
        for (int number : numbers) {
            System.out.println(number);
        }
//        python -> for i in list:

        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        // ex) 인덱스 값이 필요한 경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
        // 혹은
        int i = 0;
        for (int number : numbers) {
            System.out.println("number" + i + "번의 결과는: " + number);
            i++;
        }
        // 하지만 변수 스코프가 너무 넓어 좋지 않아 보임.
    }
}
