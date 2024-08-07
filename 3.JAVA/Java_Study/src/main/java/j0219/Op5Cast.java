package j0219;

public class Op5Cast {

	public static void main(String[] args) {
		
		//형변환(Casting)	
		/*
		 * 자동형변환(작은 범위에서 큰 범위로 이동할 때는 자동으로 형변환 된다.)
		 * 
		 * 1. 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때만 자동 타입 변환이 발생한다. 메모리 낭비가 발생할 수 있다.
		 * 
		 * 작은 타입과 큰 타입을 구분하는 기준은 각 데이터 타입의 '메모리 크기(byte)'이다.
		 * 
		 * 		byte(1byte) -> short(2byte) -> int(4byte) -> long(8byte) -> float(4byte) -> double(8byte)
		 *
		 * */

		byte s = 12; // -> 2진수로 바꾸면    00001100
		
		
		byte small_bowl = 10; // 작은 그릇
		int big_bowl = 10000; // 큰그릇

		int result = big_bowl - small_bowl; // small_bowl이 int형으로 자동 형변환 되어 int 끼리 계산된다.
		System.out.println(result); // 9990
		
		
		System.out.println("--------------------------------------------");
		
		byte a = 32;

		// 1 byte로 저장된 값을 2 byte로 변환
		short b = a;

		// 2 byte로 저장된 값을 4 byte로 변환
		int c = b;

		// 4 byte로 저장된 값을 8 byte로 변환
		long d = c;

		
		System.out.println("--------------------------------------------");
		
		
		int aa = 1234;
		float bb = aa; // 작은 범위의 타입을 큰 타입으로 넣을 때는 자동으로 형변환을 컴파일러가 해줌

		float cc = 3.14f;
		//int dd = cc; // 에러!!! - 큰 범위의 타입을 작은 타입으로 하려면 자동 형변환 해주지 않는다. 값 손실 발생
		
		
		System.out.println("--------------------------------------------");
		
		char ch1 = 'a';
		int charNumber = ch1; // 문자형은 int 타입으로 자동 형변환

		System.out.println("charNumber : " + charNumber); // charNumber : 97
		
		
		System.out.println("--------------------------------------------");
		
		/*
		 * 명시적형변환(강제 형변환)
		 * 
		 * 강제적으로 변환하는 것으로, 데이터 손실이 발생할 수 있다. 
		 * ex. 실수 타입을 정수 타입으로 강제 변환하면, 소수점 이하의 데이터들은 버려진다.
		 * 
		 * 
		 * */
		System.out.println("강제 형변환");
		int num1 = 123456;
		int num2 = 123456;
		
		float f_num1 = num2; // 강제 형변환
		
		System.out.println(f_num1); //123456.0
		
		num2 = (int)f_num1;
		System.out.println(num2); // 123456
		
		System.out.println("--------------------------------------------");
		System.out.println("주의 할 점");
		byte s2 = 12;
		short s3 = 45;
		int re = s2+s3; // int 형으로 형변환해야함.  why? 사칙연산의 기본 타입은 integer 자료형임.
		// int 보다 작은 자료형인 byte, short, char의 사칙연산은 int 를 따라가지만, int 보다 큰 자료형인 float, double 등과의 사칙연산은 큰 자료형을 따라간다.
		System.out.println("Re = " + re); //57
				
		System.out.println("--------------------------------------------");
		System.out.println("short 로 계산을 하고 싶을 경우");
		// short re2 = (short)s2+s3; -> s2값만 short로 형변환되므로 에러 발생
		short re2 = (short)(s2+s3); // short로 형변환될 수 있도록  연산값을 괄호로 바꾼다 
		System.out.println("Re = "+ re); //57

	}

}
