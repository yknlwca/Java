package Day1;

public class Variable {
	public static void main(String[] args) {
		int intVar = -123123;
		long longVar = -1231314214124214L;
//		System.out.println(intVar);
//		System.out.println(longVar);
		
		float floatVar;
		double doubleVar; // 선언
		
		floatVar = 12.16f;
		doubleVar = 456645.8315; // 할당
		
//		System.out.println(floatVar);
//		System.out.println(doubleVar);
		
		boolean boolVar1 = true;
		boolean boolVar2 = false;
		
//		System.out.println(boolVar1);
//		System.out.println(boolVar2);
		
		char charVar = 'a';
//		System.out.println(charVar);
		
		int intVar2 = (int) longVar;
		
		System.out.println(longVar);
		System.out.println(intVar2);
		
		float fvar = 100.123f;
		System.out.println(fvar);
		
		long var = (long) fvar;
		System.out.println(var);
		
	}

}
