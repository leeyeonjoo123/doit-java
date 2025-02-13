package sec02_primarydatatype.EX03;

public class PrimaryDataType_2 {
	public static void main(String[] args) {
		//#4. 문자(char) : 문자, 정수 저장 가능.
		//읽을 때는 문자로만 읽는다(왜냐? char 자료형은 문자를 읽기위해 만든 자료형)
		//#4-1. 문자로 저장하는 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3'; // 3이라고하는 51이라는 값으로 저장하자고 전 세계가 약속을 함
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//#4-2. 정수로 저장하는 방법
		char value4 = 65; //A (유니코드 표에서 65에 해당하는 값을 읽음
		char value5 = 0xac00; // 16진수로 (0x가 붙으면 16진수라는 의미)
		char value6 = 51; //3 숫자 3의 문자
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		
		//#4-3. 유니코드로 저장하는 방법(문자 입력하는 방식처럼 ' ' 을 사용한다)
		char value7 = '\u0041'; // A에 해당하는 유니코드가 65. 65에 해당하는 16진수 수를 입력
		char value8 = '\uac00'; // '가'
		char value9 = '\u0032'; // 2
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		
	}
}
