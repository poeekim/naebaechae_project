package kim;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WriteActionController implements Controller {

    BoardDAO dao;// BoardDAO dao = new BoardDAO();

    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("WriteActionController - setDAO 호출 - dao = " + dao);
    }

    // 1. request(요청) 2. response(응답)
    // 3. 입력받은 값을 자동적으로 Setter Method 호출을 해줌(=담아주는 객체)
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("handle() 자동 호출");
        request.setCharacterEncoding("utf-8");

        // 이미 Setter Method 가 호출된 상태.

        BoardCommand data = new BoardCommand();
        //추가
        int newNum=dao.getNewNum()+1;
        data.setNum(newNum);
        data.setAuthor(request.getParameter("author"));
        data.setTitle(request.getParameter("title"));
        data.setContent(request.getParameter("content"));
        dao.write(data);


    return new ModelAndView("redirect:/list.do");

    }
}
