package kim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class WriteActionController {
//    public class WriteActionController implements Controller {



    BoardDAO dao;


@Required
@Autowired
    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("WriteActionController - setDAO 호출 - dao = " + dao);
    }


    @RequestMapping("/write.do") //@RequestParam("매개변수명") 반환형 변수명;
    protected ModelAndView test(@RequestParam("title") String title,
                                @RequestParam("author") String author,
                                @RequestParam("content") String content
    ) throws Exception {

        System.out.println("WriteActionController() - test callback");

        BoardCommand data = new BoardCommand();

        int newNum = dao.getNewNum() + 1; // 수동으로 계산해서 넣어준다(새로운 값을 부여함)
        data.setNum(newNum);
        data.setTitle(title);
        data.setAuthor(author);
        data.setContent(content);
        dao.write(data);


    return new ModelAndView("redirect:/list.do");

    }
}
