package kim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DeleteActionController {

    @Autowired
    BoardDAO dao;// BoardDAO dao = new BoardDAO();


/*
    @Autowired
    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("setDAO 호출 - dao = " + dao);
    }
*/

    @RequestMapping("/delete.do")
    public ModelAndView handleRequest(@RequestParam("num") int num) throws Exception {

        System.out.println("DeleteActionController callback Method");
        // String num = request.getParameter("num");

        dao.delete(num); // 삭제
        ModelAndView mav = new ModelAndView("redirect:/list.do");

        return mav;
    }

}
