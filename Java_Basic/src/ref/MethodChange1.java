package ref;

// 대워칙 : 자바는 항상 변수의 값을 복사해서 대입한다.
public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);
    }

    public static void changePrimitive(int x){
        x = 20;
    }

}
