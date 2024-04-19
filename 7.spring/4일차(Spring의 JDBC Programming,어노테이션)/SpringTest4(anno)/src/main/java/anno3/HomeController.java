package anno3;

import javax.annotation.Resource;

public class HomeController {
    /*
    * @Resource 와 @Autowired 비교
    *
    * 공통점 : 자동적으로 멤버변수에 객체를 넣어준다
    * 차이점 : @Autowired 는 타입(byType)을 이용해서 의존성을 주입, 생성자/필드/메소드 모두 적용 가능.
    *         @Resource 는 이름(byName)을 이용해서 의존성을 주입, 필드/메소드에만 적용 가능.
    *
    *
    * */
    @Resource(name = "camera2") // @Resource(name="beans의 구분자id")
    private Camera camera2; // == <bean id="camera2" class="`~~" />

    private Camera camera3;
    private Camera camera4;


    @Resource(name = "camera3")
    public void setCamera3(Camera camera3) {
        this.camera3 = camera3;
        System.out.println("setCamera3 - camera3 = " + camera3);
    }

    @Resource(name = "camera4")
    public void setCamera4(Camera camera4) {
        this.camera4 = camera4;
        System.out.println("setCamera4 - camera4 = " + camera4);
    }

    @Override
    public String toString() {
        return "HomeController[camera2= " + camera2 + " , camera3 = " + camera3 + " , camera4 = " + camera4+"]";
    }
}
