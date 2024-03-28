import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/*
* Get or Post
* 하나의 메소드에서 통합해서 요청을 처리하고 싶다.
* 요청을 받아서 처리해주는 메소드 -> 매개변수 2개 필요(request, response) 필요.
*                                           request, response 가 멤버변수로 선언되어 있지 않을 경우 사용가능
* */
@WebServlet("/SimpleController")

public class SimpleController extends HttpServlet {

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{


        // 1. 요청명령어를 입력(매개변수로 설정)
        String type = request.getParameter("type");
        System.out.println("type = " + type);
        
        // 2. 요청명령어 분리 (ex. greeting -> 안녕하세요 +오늘날짜 -> 오늘날짜는 출력이안됨(invalid Type 잘못요청)
        Object resultObject = null; // String or java.util.Date 둘다 저장이 가능한 자료형
        if (type == null || type.contentEquals("greeting")) {
            resultObject = "안녕하세요";
        } else if (type.contentEquals("date")) {
            resultObject = new java.util.Date();
        }else { // 전혀 모르는 매개변수가 전달되었을 경우
            resultObject = "Invalid Type";
        }

        // 3. 분리한 요청명령어에 따른 결과를 저장 -> 서버의 메모리에 저장하여 jsp 페이지로 이동 및 공유
        request.setAttribute("result", resultObject); //서버저장
        


        // 4. 결과를 jsp 로 전송. 페이지 이동하여 결과를 보여준다. -> forward 메소드 필요
        RequestDispatcher dispatcher = request.getRequestDispatcher("/simple.jsp"); // resultObjesct 값이 들어있는 result 변수를
        // dispatcher 객체가 전달 받아, forward 메소드를 통해 simple.jsp 한테 해당 변수를 뿌려준다.
        // dispatcher(정보를 제공할 페이지정보, 서버의 정보를 공유)

        // 5. forward() : 데이터를 공유시키면서 페이지 이동 기능
        dispatcher.forward(request, response); // forward 액션태그역할을 한다.
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
