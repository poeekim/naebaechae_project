package j0227;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
