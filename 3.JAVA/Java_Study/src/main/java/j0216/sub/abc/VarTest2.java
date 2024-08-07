package j0216.sub.abc;

public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			

/*
//		실수 자료형 : float, double 
 * 						소수점 이하의 값을 지니는 실수의 저장 및 표현을 위한 자료형.
 * 						허나 이 둘 모두 정밀도를 포기하고 표현의 범위를 넓인 자료형이기 떄문에, 정확한 실수 값을 다룰 수 없다.
 * 						예를 들어 0.1 을 2진법으로 표현하면 0.00010001.. 으로 무한한 공간이 필요하므로, 컴퓨터는 실수를 제대로 저장할 수 없다.
 * 	byte -> short,char -> int -> long -> float -> double 순.
 * 
 * long a = 111111111111;
 * float b = 111111111111.5; // 4바이트.
 * 
 * 보통 자바에서 소수점이 있는 값은 double로 저장된다.
 * float a = 1.2f; -- 에러발생 4바이트. 숫자 뒤에 f 를 붙여서 float 형식으로 저장되도록 정의
 * double a = 1.2 -- 
 */
		System.out.println("실수 자료형");
		
		float a = 1.5f;
		System.out.println("float a = "+a); //1.5
		
		double d = 1.5;
		System.out.println("double d = "+d);//1.5
		
		float m_float = 123456.789123f;
		double m_double = 123456.789123;
		
		System.out.println(m_float); // 123456.79
		System.out.println(m_double); // 123456.789123
		
		// 소수점 둘째자리까지의 숫자를 저장할 땐 float 를 쓰고, 그보다 더 정밀한 값에 관해서는 double을 쓰는것을 추천한다.
		
		m_float = 0.5f;
		float m_float2 = 55555555555.5555555f;
		System.out.println("m_float2 = "+m_float2);
		System.out.println(m_float + m_float2); // 1.0555556
		
	}

}
