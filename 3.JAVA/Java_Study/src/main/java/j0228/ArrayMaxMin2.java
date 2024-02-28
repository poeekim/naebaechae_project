package j0228;

import java.util.Scanner;



public class ArrayMaxMin2 {
	static void arrayPrint(int score[]) {
		int max=score[0];
		int min=score[0];//79

		for(int i=1;i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
				System.out.println("중간max=>"+max+",score["+i+"]=>"+score[i]);
			}else if(score[i]<min) {
				min=score[i];
				System.out.println("중간min=>"+min+",score["+i+"]=>"+score[i]);
			}
		}//for
		System.out.println("최대값=>"+max);
		System.out.println("최소값=>"+min);
		System.out.println("최대값-최소값=>"+(max-min));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score[] = new int[7];
		System.out.println("7과목의 점수를 입력하시오.");

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
//			System.out.println("a[" + i + "] = " + score[i]);
		}
		System.out.println("================================");

		arrayPrint(score);

/*		int max=score[0];
		int min=score[0];//79

		for(int i=1;i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
				System.out.println("중간max=>"+max+",score["+i+"]=>"+score[i]);
			}else if(score[i]<min) {
				min=score[i];
				System.out.println("중간min=>"+min+",score["+i+"]=>"+score[i]);
			}
		}//for
		System.out.println("최대값=>"+max);
		System.out.println("최소값=>"+min);
		System.out.println("최대값-최소값=>"+(max-min));*/
	}

}
