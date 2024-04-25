package kim;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class RetrieveActionController implements Controller {

    BoardDAO dao;// BoardDAO dao = new BoardDAO();

    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("setDAO 호출 - dao = " + dao);
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        System.out.println("RetrieveActionController callback Method");
        String num = request.getParameter("num");

        Board data = dao.retrieve(num);

/*        ModelAndView mav = new ModelAndView();
        mav.setViewName("retrieve"); // 파일명 : list*/
        ModelAndView mav = new ModelAndView("retrieve");


        // 데이터 공유
        mav.addObject("data", data);
        System.out.println("mav = " + mav);
        return mav;
    }

}
