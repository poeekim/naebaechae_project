package j0219;

public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 대입연산자(삼항연산자)  : 조건식에 따라서 변수에 저장된 값을 선택하여 저장시키는 연산
		// 조건식 ? 참일경우 :  거짓일경우
		
		int a = 5; int b = 7;
		int x =10, y = -10;
		
		int absX = (x >= 0)? x : -(x); //
		int absY = (y >= 0)? y : -y; //
		
		System.out.println(absX);
		System.out.println(absY);
		
		
		// 대입연산자 : int c = a+b; a=a+1, a=a-1,a=a*1,a=a/1
		// 자기 변수에서 값을 계산한 후에 자기변수에 대입(저장).
		// a=a+1   ==    a+=1    ==    a++
		
		
		// 각 섹션별로 a와 b를 초기화 해주지 않으면 순차적으로 계산된 값이 a,b에 저장되기 때문에,
		// 결과값이 달라진다. (a+=b : a=12 값이 그 아래 a-=b식에 영향을 준다)
		
		a+= b; // a=a+b
		System.out.println("a = "+a); // a = 12
		
		
		a = 5; b = 7; // 초기화
		a-= b; // a=a-b
		System.out.println("a = "+a); // a = -2
		
		
		
		a = 5; b = 7;// 초기화
		a*= b; // a=a*b
		System.out.println("a = "+a); // a = 35
		
		
		
		a = 5; b = 7;// 초기화
		a/= b; // a=a/b
		System.out.println("a = "+a); // a = 0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
