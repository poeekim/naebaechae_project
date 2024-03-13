import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @WebServlet('서블릿을 실행하기 위한 경로를 지정(가상경로) / 실행시킬 서블릿 클래스명")
 *       ex. /abc/test/hello 라고 요청시 -> @WebServlet("/abc/test/hello")
 * */
@WebServlet("/HelloTest")
public class HelloTest extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("서블릿 실행시 제일먼저 호추되는 메소드(init)");
        System.out.println("생성자와 같은 역할(서블릿의 초기값을 설정");
    }

    @Override
    public void destroy() {
        System.out.println("소스코드를 변경해서 다시 새로고침할 때(reload) destroy()");
        System.out.println("서블릿이 종료될때(메모리 해제할 때 사용");
    }

    // 요청을 받아서 처리해주는 메소드(Get 방식으로 요청시 처리) 웹서핑 : 내부에서 자동호출(call back)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("웹상에서 get 방식으로 접속할 때마다 자동으로 호출한다.");

        // 1.  어떤 형태의 문서를 보낼 지 결정한다. (html + 한글 | 영어)  : response.setContentType("text/html"); // 영어일 경우
        response.setContentType("text/html;charset=utf-8"); // 한글 & 영어 일 경우
        // 2. PrintWriter out = new PrintWriter();
        PrintWriter out = response.getWriter(); // 객체를 얻어오는 법 3 (메소드의 반환값)
        // 3. HTML 문서를 만들어서 전송하기
        out.println("<html><head></head>");  // 끊어서 선언해준다.
        out.println("<body>");
        // 접속자에게 보여줄 내용 작성
        out.println("<h2>사이트 접속을 환영합니다.</h2>");
        out.println("</body>");
        out.println("</html>");

    }

    // post 방식으로 요청이 들어왔을 때 처리해 주는 메소드(회원가입, 회원수정, 회원로그인)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
