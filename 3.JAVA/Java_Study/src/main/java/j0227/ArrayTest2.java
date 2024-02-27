package j0227;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 1차원 배열 문제

        int b[] = {58, 38, 12, 36, 41, 27, 26, 32, 59, 16, 18, 28, 21, 17};

        // 1. 20대의 나이는 몇명? 그리고 그 최대값과 최소값은 몇?
        int count=0;
//        int result[] = new int[10];
        for(int i = 0; i<b.length; i++){
            if(b[i]>=20 && b[i]<=29){
                count++;
            }
        }System.out.println("20대는 총 " + count + "명");

        System.out.println("================================");

        int score[]= {79,88,91,33,100,55,95};

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




    }

