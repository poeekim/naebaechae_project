package spring8;


import java.util.Properties;

// 서버에 접속한 후, 접속한 도서관의 ip 주소(도메인) , 접속시간 제한(동시접속)을 적용된 정보를 저장하자  -> Properties(Map)
public class BookClient {

    private Properties prop;

    // <property> 태그
    public void setProp(Properties prop) {
        this.prop = prop;
        System.out.println("setProp() 호출 : "+prop);

    }
}
