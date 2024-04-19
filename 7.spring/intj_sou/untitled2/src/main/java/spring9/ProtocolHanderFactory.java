package spring9;

import java.util.Map;
import java.util.Objects;

class RestHandler{
// new RestHandler()... -> 기본생성자 = public RestHandler(){}

}
class Soaphandler{}

public class ProtocolHanderFactory {
    // Map 객체 -> Hashmap(session 객체) -> HashTable객체(페이징 처리할 떄 사용)
    private Map<String, Objects> map;

    public void setMap(Map<String, Objects> map) {
        this.map = map;
        System.out.println("map = " + map);
    }
}
