package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = (double) intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue = " + doubleValue);
    }
}
// 묵시적 형변환 : 작은 범위 -> 큰 범위
// 명시적 형변환 : 큰 범위 -> 작은 범위
