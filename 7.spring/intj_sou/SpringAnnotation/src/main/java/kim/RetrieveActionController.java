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
public class RetrieveActionController {
//    public class RetrieveActionController implements Controller {

    @Autowired
    BoardDAO dao;// BoardDAO dao = new BoardDAO();

/*    @Required

    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("setDAO 호출 - dao = " + dao);
    }*/

    @RequestMapping("/retrieve.do")
    public ModelAndView handleRequest(@RequestParam("num") int num) throws Exception {

        System.out.println("RetrieveActionController callback Method");
       // int num = Integer.parseInt(num);


/*        ModelAndView mav = new ModelAndView();
        mav.setViewName("retrieve"); // 파일명 : list*/

        dao.updateReadcnt(num);//reacnt=readcnt+1
        BoardCommand data=dao.retrieve(num);
        //----------------------------------
        ModelAndView mav=new ModelAndView("retrieve");//이동할 페이지명


        // 데이터 공유
        mav.addObject("data", data);
        System.out.println("mav = " + mav);
        return mav;
    }

}
