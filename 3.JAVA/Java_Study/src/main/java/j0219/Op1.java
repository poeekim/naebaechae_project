package j0219;

public class Op1 {

	public static void main(String[] args) {
		// 연산자
		
		//--------------------------------------------------
		// 증가연산자
		
		int a =3, b=4;
		int c = a + b; 
		System.out.println("c : "+c);
		
		//--------------------------------------------------
		// 원의 면적 : r * r * 3.14;
		int a1 = 4;
		double cal = a1 * a1 * 3.14;
		System.out.println("cal : "+cal);
		
		
		//--------------------------------------------------
		// ++ , --
		
		int a2 = 4;
		int b2 = a2++;
		System.out.println("a2 : "+ a2);
		System.out.println("b2 : "+ b2);
		
		int b3 = ++a2;
		System.out.println("b3 : "+ b3);
		
		//--------------------------------------------------
		int c1 = 2;
		int d1 = ++a1;
		
		System.out.println(c1+d1);
	}

}
