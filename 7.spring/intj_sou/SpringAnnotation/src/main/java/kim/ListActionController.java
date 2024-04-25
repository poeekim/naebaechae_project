package kim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ListActionController {
//    public class ListActionController implements Controller {


    BoardDAO dao;// BoardDAO dao = new BoardDAO();

    @Required
    @Autowired
    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("setDAO 호출 - dao = " + dao);
    }


@RequestMapping("/list.do")
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {

        System.out.println("ListActionController  success ");
        List list = dao.list(); // 요청에 따른 처리 결과(레코드 덩어리)

        ModelAndView mav = new ModelAndView();
        mav.setViewName("list"); // 파일명 : list

        // 데이터 공유
        mav.addObject("list", list);
        System.out.println("mav = " + mav);
        return mav;
    }

}
