package sec02_primarydatatype.EX01;

public class FloatVsDouble {
	public static void main(String[] args) {
		//#1. Float의 정밀도(소수점 7번째 까지)
		float f1 = 1.12345678f;
		System.out.println(f1);
		float f2 = 1.1234567f;
		System.out.println(f2);
		
		
		//#2. double의 정밀도(소수점 15번째까지 )
		double d1 = 1.1234567891234567;
		double d2 = 1.123456789123456;
		
		System.out.println(d1);
		System.out.println(d2);
		
}
}
