package j0220.sub;

public class Rec {
    private int x,y = 0;
    private int area; // 면적 -> 원 double area;

    public void setX(int a){
        if (a<0){
            System.out.println("x값은 음수입력불가");
            x=20; // 값을 입력받지 못할 경우를 대비해 초기값 설정
            return;
        }
        x=a; // 멤버변수=매개변수
    }

    public void setY(int b){
        if (b<0){
            System.out.println("y값은 음수입력불가");
            return;
        }
        y=b; // 멤버변수=매개변수
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    void print(){
        System.out.println("x : "+ x + "/  y : "+ y);
        System.out.println("x*y = "+ (x*y));
    }

    /*
     * 저장, 계산, 출력 기능의 메소드는 매개변수는 있지만, 반환값은 없다.
     *
     * */

    void area(int a, int b){
        x=a;
        y=b;
        System.out.println("x*y = "+ (x*y));
    }

    /*
     * 매개변수 O , 반환형 O
     * 반환값 반환형 메소드명(매개변수...)
     * { 기술, return 계산결과값(변수) or (수식) or 객체
     * }
     */

    int area2(int a, int b){
        /*
        int result = a*b; // result 는 지역변수이므로 메소드 내부에서만 사용가능
       return result;
       위 식을 간단하게 나타내면 아래 식과 동일함
        * */
        System.out.println("a  = " + a+ "/  b = "+b);
        return (a * b);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
