package j0226;

class Rect {

    private float result;


    public void setRect(int x, int y) {
        if(x<0 || y<0){
            System.out.println("값은 양수만 가능하다");
            x= 1; y=1;
            return;
        }
        result = x * y;
        System.out.printf("사각형의 넓이 : %.2f\n",result);

    }

    public void setTriangle(int x, int y){
        if(x<=0 || y<=0){
            System.out.println("값은 양수만 가능하다");
            x= 1; y=1;
            return;
        }
        result = (x * y)/2;
        System.out.printf("삼각형의 넓이 : %.2f\n",result);
    }

    public void setcircle(int x){
        if(x<=0){
            System.out.println("값은 양수만 가능하다");
            x= 1;
            return;
        }
        result = (x*x)*3.14f;
        System.out.printf("원의 넓이 : %.2f\n",result);
    }

    public float getRect() {
        return result;
    }

    public float getTriangle() {
        return result;
    }

    public float getCircle() {
        return result;
    }
}


public class RectHandling {
    public static void main(String[] args) {

        Rect rect = new Rect();

        rect.setRect(2, 3);
        rect.setTriangle(-2,3);
        rect.setcircle(2);

    }
}
