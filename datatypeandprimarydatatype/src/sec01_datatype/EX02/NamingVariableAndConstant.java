package sec01_datatype.EX02;

public class NamingVariableAndConstant {
	//#1. 변수의 이름
	boolean abcDE ; //가능하지만 권고 사항 위배
	byte 가나다 ; // 한글 사용 가능
	char $df_do; // 사용가능
	//int 12ce ; // 불가능(숫자는 제일 앞에 올 수 없다)
	int c2 ; //
	String main; //메서드 이름과 변수이름은 동일해도 무관하다(호출 방법이 다르기 때문에)

	//abc(); //메서드호출
//	System.out.print(abc);// 변수 사용
	
	final String jun = "jun";
	//jun = "momo";// 불가능
	
	//#2. 상수이름
	final double PI;
	final int MY_DATA;
	
	
}
