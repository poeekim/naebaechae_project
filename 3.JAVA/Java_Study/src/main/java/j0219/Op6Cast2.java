package j0219;

public class Op6Cast2 {

	public static void main(String[] args) {
		// 
		
		int num1 = 20, num2 = 30;
		char c = 'A';
		String sen ="안녕"; 
		float f_num = 123.456789f;
		
		/*
		 * print(), println() -> 줄바꿈
		 * printf(출력양식,, 출력할 대상자) -> 출력할 값을 출력 양식에 맞게 출력
		 * 
		 * decimal 			char 			String 			float
		 *   %d(정수)		%c(문자)	%s(문자열)		%f(소수점)
		 * 
		 * 
		 * */
		
		System.out.printf("첫번째 숫자 = %d", num1); //  첫번째 숫자 = 20
		System.out.printf("char c = %c", c);  // char c = A
		System.out.printf("String sen = %s", sen); // String sen = 안녕
		System.out.printf("float f_num = %f", f_num); // float f_num = 123.456787

		// printf 는 줄바꿈이 안되므로 사이사이 System.out.printf('\n')을 적어서 줄바꿈을 해줘야함.
		
		char ch = 'A';
		System.out.println();// 줄바꿈
		// printf 함수의 특징 : char 타입을 자동으로 int로 변환하지 못한다. = 강제로 변환해야함.
		//System.out.printf("문자 %c 의 유니코드 값은 %d\n",ch,ch); // 에러발생
		System.out.printf("문자 %c 의 유니코드 값은 %d\n",ch,(int)ch);
		
		
		System.out.println("------------------------------------------");
		System.out.println("----------------연습문제------------------");
		
		
		// 총점을 구하라
		
		int total;
		int java = 90, jsp = 85, oracle = 90;
		
		total = java+jsp+oracle;
		System.out.println("총점 : " +total);
		System.out.printf("총점은 %d", total);
		System.out.println();// 줄바꿈
		
		//평균을 구하라
		
		//int avg = total/3; // + , - , * , / 는 자동으로 int 형식으로 바뀐다. 애초에 더하는 부분에서부터 double 형으로 변환해줘야함 
		double avg1 = (double)total/3;
		System.out.printf("평균은 %f", avg1);
		
		System.out.println();// 줄바꿈
		// 정해진 소수점 자리수 표현하기 ->  %f : %전체자리수, 소수점자리수   
		//ex. %.2f ( 소수점 둘째자리까지). 전체자리수는 써도 되고 안써도 됨.
		System.out.printf("평균은 %5.2f", avg1);
		System.out.printf("평균은 %.2f", avg1);
		
		System.out.println("------------------------------------------");
		System.out.println("abc\t123\t456"); // \t 탭키만큼 띄어쓰기
		System.out.println("HelloTEST"); // 출력 시 "HelloTEST" 를 띄우고 싶으면 문자열 앞뒤에 \ 을 붙이면됨
		System.out.println("\"HelloTEST\"");
	}

}
