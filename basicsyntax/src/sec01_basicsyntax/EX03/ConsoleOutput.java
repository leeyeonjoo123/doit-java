package sec01_basicsyntax.EX03;

public class ConsoleOutput {
	public static void main(String[] args) {
	
	//#1. Syste.out.println()
		System.out.println("콘솔123출력");
		System.out.println("화면" + 3); //한쪽만 문자열이라도 모두 문자열로 인식해
		System.out.println("화면" + "3");
		//순서에 따라 결과가 완전 다르다
		//앞에서부터 하나씩 계산
		System.out.println(5+8+"화면" + "3"); //앞에 숫자라서 숫자로 인식해서 연산됨
		System.out.println("화면" + 3+5); //앞에서 부터 화면 + 3 이 문자로 인식되어서 5도 문자로 인식
	
		int a = 3; //3을 a라는 공간에 집어 넣는다. 이 공간은 숫자만 들어올 수 있다.
		String b = "화면";
		
		
	// #2. System.out.print()	
		System.out.print("이것은");
		System.out.print("개행이");
		System.out.print("안된다");
		System.out.print("\n"); // \n 은 개행해라는 의미
		
		
		
	// #3. System.out.printf()
		// %d : 10진수, %o: 8진수, %:16진수
		System.out.printf("%d\n", 30); //두번째 인자가 첫번째 인자에 들어가는 데이터  
		System.out.printf("%o\n", 30); 
		System.out.printf("%x\n", 30); 
		System.out.printf("%s\n", "나이"); //문자열 출력 
		System.out.printf("%f\n", 100.255); //실수 출력 - 소숫점 6자리 까지
		System.out.printf("%5.2f\n", 10.255); // 전체자리수 4개 , 소숫점 자리 2개 
		// % 갯수는 여러개 와도 됨, %갯수만큼 인자를 줘야됨(argumen) 
		System.out.printf("%5.2f 개의  %s", 10.255, "apple"); // 전체자리수 4개 , 소숫점 자리 2개 
	}}
