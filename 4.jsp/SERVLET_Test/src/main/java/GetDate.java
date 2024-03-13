import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/GetDate")
public class GetDate extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8"); // 한글 & 영어 일 경우
        // 2. PrintWriter out = new PrintWriter();
        PrintWriter out = response.getWriter(); // 객체를 얻어오는 법 3 (메소드의 반환값)
        // 3. HTML 문서를 만들어서 전송하기
        out.println("<html><head></head>");  // 끊어서 선언해준다.
        out.println("<body>");
        // 내용추가
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String addr = request.getParameter("addr");
        System.out.println("name = " + name+"addr = " + addr);
        out.println("name = " + name+"addr = " + addr);
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
