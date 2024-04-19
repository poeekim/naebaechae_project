package anno6;

/*
* 인터페이스 => 클래스,, 클래스+클래스 => xml 로 작성(의존성 객체 가져옴)
* -----------------------------------------
* 따로 자바 파일을 만들어서 (AppConfig.java) Xml 역할을 대신함. 파일 이름은 상관없음.
*
*
* */
public class MyBeanImpl implements MyBean {

    @Override
    public String getBeanName() {
        return "My Service Bean";
    }
}
