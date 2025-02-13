package sec02_primarydatatype.EX05;

public class TypeCasting_2 {
	
	//#1.자동타입변환(업캐스팅)
	float value1 = 3; //int를 float으로 캐스팅 -> 업캐스팅 ->생략해도 자동으로 됨
	long value2 = 5; 
	double value3= 7;
	//일반적으로 int로 저장되지만, byte가 명시되어있어서 byte로 저장됨
	//(그래서 int가 byte로 저장되는거라서 다운캐스팅. byte나 short로 캐스팅)
	byte value4 = 9; 
	short value5 = 11;
	
	//#2. 수동타입변환
	byte value6 = (byte) 128; // byte = int 이기 때문에 (byte)를 작성해준다
	int value7 = (int)3.5;
	float value8 = (float)7.5;
}
