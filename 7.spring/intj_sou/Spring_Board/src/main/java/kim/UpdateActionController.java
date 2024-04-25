package kim;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateActionController implements Controller {

    BoardDAO dao;// BoardDAO dao = new BoardDAO();

    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("UpdateActionController - setDAO 호출 - dao = " + dao);
    }

    // 1. request(요청) 2. response(응답)
    // 3. 입력받은 값을 자동적으로 Setter Method 호출을 해줌(=담아주는 객체)
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("update 를 위한 handle() 자동 호출");
        request.setCharacterEncoding("utf-8");

        // 이미 Setter Method 가 호출된 상태.

        BoardCommand data = new  BoardCommand();

        // 수정이 되기 위해서는 num 이 꼭 필요 (WriteActionController 에서는 필요 X)
        String num = request.getParameter("num");


         data.setAuthor(request.getParameter("author"));
        data.setTitle(request.getParameter("title"));
        data.setContent(request.getParameter("content"));
         dao.update(num, data.getAuthor(),data.getTitle(),data.getContent());
    return new ModelAndView("redirect:/list.do");

    }
}
