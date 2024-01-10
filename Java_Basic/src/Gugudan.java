package Day1;

public class Gugudan {

	public static void main(String[] args) {
		
//		for (초기식; 조건식; 증감식) {}
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		
//		while (조건식) {}
		int a = 2;
		while (a <= 9) {
			int b = 1;
			while (b <= 9) {
				System.out.println(a + " x " + b + " = " + (a * b));
				b++;
			}
			a++;
		}
		
//		if (조건식) {}
//		true or false
//		else if, else
		
		int N = 11;
		if (N % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
//		switch (값) {
//			case '값' :
//		}
		
		int fruit = 6;
		
		switch (fruit) {
		case 0:
			System.out.println("사과");
			break;
		case 1:
			System.out.println("포도");
			break;
		case 2:
			System.out.println("귤");
			break;
		default :
			System.out.println("모름");
		
		}		
	}
}
