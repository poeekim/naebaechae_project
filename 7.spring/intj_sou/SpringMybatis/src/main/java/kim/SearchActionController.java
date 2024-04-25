package kim;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.tags.EditorAwareTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class SearchActionController implements Controller {

    BoardDAO dao;// BoardDAO dao = new BoardDAO();

    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("setDAO 호출 - dao = " + dao);
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        System.out.println("SearchActionController callback = ");

        String searchName = request.getParameter("searchName");
        String searchValue = request.getParameter("searchValue");

        System.out.println("searchName = " + searchName);
        System.out.println("searchValue = " + searchValue);


        BoardCommand data=new BoardCommand();
        data.setSearchName(searchName);
        data.setSearchValue(searchValue);
        List list=dao.search(data);



//       ArrayList list = dao.search(searchName,searchValue); // 요청에 따른 처리 결과(레코드 덩어리)

        ModelAndView mav = new ModelAndView();
        mav.setViewName("list"); // 파일명 : list

        // 데이터 공유
        mav.addObject("list", list); // 이게 필수네...6
        System.out.println("mav = " + mav);
        return mav;
    }

}
