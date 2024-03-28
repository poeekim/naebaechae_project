package action;


// 기능은 다르지만, 요청받아 처리하는 메소드를 공통의 메소드로 따로 분리하여 관리하기 위해 인터페이스로 작성한다.
import javax.servlet.http.HttpServletRequest; // 요청객체
import javax.servlet.http.HttpServletResponse; // 응답객체


// 요청명령어는 다르지만 요청받아서 처리해주는 기능은 공통적이다. -> 공통기능을 추상메소드로 선언한다.
public interface CommandAction {

    // 오청을 받으면, 요청에 따른 결과물을 이동할 페이지로 넘겨줘야하므로 페이지경로와 페이지명이 필요하다.
    // == String 객체가 필요함
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable;
}
