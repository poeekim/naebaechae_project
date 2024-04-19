package anno4;

import oracle.jdbc.proxy.annotation.Post;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class HomeController2 {

    private Camera camera;


    @Resource(name = "camera5")
    public void setCamera4(Camera camera) {
        this.camera = camera;
        System.out.println("setCamera4 - camera = " + camera);
    }

    @PostConstruct
    public void init() {
        System.out.println("beans 객체를 이용하기 이전에 초기화를 시키는(생성자) @PostConstruct 어노테이션");
    }

    @PreDestroy
    public void close() {
        System.out.println("beans 객체를 생성한 후 메모리 해제 목적으로 호출하는 @PreDestroy 어노테이션");
    }

    @Override
    public String toString() {
        return "HomeController2[camera= " + camera+"]";
    }
}
