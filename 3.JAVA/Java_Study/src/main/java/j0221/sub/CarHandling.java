package j0221.sub;

public class CarHandling {
    public static void main(String[] args) {

        // 1. 객체 생성 : 저장할 대상자
        // 형식 ) 설계도이름(클래스 이름) 객체명(변수) = new 클래스명();
        int age; // 4byte 기억공간 생성
        Car morning = new Car();

        // Setter 메소드를 통해서 값을 저장
        /*
        morning.name = "모닝";
        morning.output = 1000;
        morning.color = "blue";
        morning.year = 2021;
        * */
        morning.setName("모닝");
        morning.setOutput(-1000);
        morning.setColor("white");
        morning.setYear(2021);

        // 3. 운전 : 시동걸기 메소드 호출 : 객체명.호출할 메소드명
        morning.startEnginee();
        morning.speedUp(150);
        morning.speedDown(30);

        morning.carInfoPrint();
        morning.stop();









        // ==============================================
        /*// 2. 객체명(저장된 위치명).멤버변수 = 값(저장)





        // 일일이 하나씩 입력을 다 해줘야 하는 것보다 아래 carInfoPrint() 메소드로 한꺼번에 가져오는 것이 더 낫다.
        System.out.println("차의이름 : "+morning.name);//객체명.멤버변수
        System.out.println("차의 배기량 : "+morning.output);
        System.out.println("차의 현재속도 : "+morning.current_speed);

        morning.carInfoPrint();
        morning.stop();*/
    }
}
