package j0219;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b1 = 5;
		short s = -4;
		int i = 8;
		
		System.out.println("b1 : " +b1);
		System.out.println("s : " +s);
		System.out.println("i : " +i);
		
		++i;
		System.out.println("++i = " + i);//9
		
		i++;
		System.out.println("i++ = "+ i);
		
		System.out.println("-------------------------------");
		for(int j = 0; j <10; ++j) {
			System.out.println(j);
		}

	}

}
