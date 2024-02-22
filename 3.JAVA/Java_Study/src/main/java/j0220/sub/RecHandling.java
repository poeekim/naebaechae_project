package j0220.sub;

public class RecHandling {



    




    public static void main(String[] args) {

        Rec r = new Rec();
//        System.out.println("r = "+ r); // 저장된 주소값
        r.setX(20);
        r.setY(20);
        r.print();
        System.out.println("--------------------");
        r.area(60, 40);
        int result = r.area2(50, 40); // 반환값이 있는 area2 는 무조건 반환받을 변수를 만들어줘야함
        System.out.println("area2 의 result 값은 " + result);




    }
}
