import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
@WebServlet("/Notice")
public class Notice extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 2. PrintWriter out = new PrintWriter();
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter(); // 객체를 얻어오는 법 3 (메소드의 반환값)
        // 3. HTML 문서를 만들어서 전송하기
        out.println("<html><head></head>");  // 끊어서 선언해준다.
        out.println("<body>");
        // 접속자에게 보여줄 내용 작성
        out.println("<h2>오늘의 공지사항 - Notice.java</h2>");
        request.setCharacterEncoding("UTF-8");
        String fileName = ""; // 불러올 파일명을 저장  /notice/2024312.txt
        Calendar cal = Calendar.getInstance(); //
        //표현식) 날짜 객체명.get(정적상수명) -> 년월일시분초 가져올 수 있음.
        fileName += cal.get(Calendar.YEAR); // ""+ 2024 = "2024"
        fileName += cal.get(Calendar.MONTH)+1; // Calendar.Month 의 반환값이 0~11 만 가져오므로 뒤에 +1 을 해줘야 정확히 몇월인지 나옴
        fileName += cal.get(Calendar.DATE);
        fileName += ".txt"; // "2024312.txt"

        String realPath = "C:\\webtest\\4.jsp\\SERVLET_Test\\src\\main\\webapp\\notice\\"+fileName;
        System.out.println("realPath = " + realPath);

        try {
            // FileInputStream(영문)  |  FileReader(한글)
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            String line = "";
            System.out.println("br = " + br);

            while ((line = br.readLine()) != null) { // 계속해서 읽어 들일 수 있는 상태라면 == 읽을 게 많다.
                out.println(line + "<br>"); // 클라이언트의 브라우저로 전송
                System.out.println(line);

            }br.close();

        } catch (IOException e) {
            System.out.println("불러올 파일의 경로와 파일명을 확인");
        } catch (Exception e) {
            System.out.println("오늘 공지사항이 없음");
        }
        out.println("<p align=center>");
        out.println("<hr>");
        out.println("<input type='submit' value='창닫기' onclick='window.close()'>");

        out.println("</body>");
        out.println("</html>");
    }

}
