package kim;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class SearchActionController implements Controller {

    BoardDAO dao;// BoardDAO dao = new BoardDAO();

    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("setDAO 호출 - dao = " + dao);
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        System.out.println("SearchActionController 호출됨 = ");

        String searchName = request.getParameter("searchName");
        String searchValue = request.getParameter("searchValue");



        ArrayList list = dao.search(searchName,searchValue); // 요청에 따른 처리 결과(레코드 덩어리)

        ModelAndView mav = new ModelAndView();
        mav.setViewName("list"); // 파일명 : list

        // 데이터 공유
        mav.addObject("list", list);
        System.out.println("mav = " + mav);
        return mav;
    }

}
