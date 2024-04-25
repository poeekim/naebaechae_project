package kim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;


@Controller
public class UpdateActionController {
//    public class WriteActionController implements Controller {


    BoardDAO dao;


@Required
@Autowired
    public void setDao(BoardDAO dao) {
        this.dao = dao;
        System.out.println("WriteActionController - setDAO 호출 - dao = " + dao);
    }


    @RequestMapping("/update.do") //@RequestParam("매개변수명") 반환형 변수명;
    protected ModelAndView test(@RequestParam("num") int num,
                                @RequestParam("title") String title,
                                @RequestParam("author") String author,
                                @RequestParam("content") String content
    ) throws Exception {

        System.out.println("WriteActionController() - test callback");

        BoardCommand data = new BoardCommand();

        data.setNum(num);
        data.setTitle(title);
        data.setAuthor(author);
        data.setContent(content);

        dao.update(data);


    return new ModelAndView("redirect:/list.do");

    }
}
