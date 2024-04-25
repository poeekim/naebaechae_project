package kim;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 웹상에서 요청을 받아서 처리를 해주는 method => request, response 매개변수가 필요하다. + 반환값 반드시.
//public class ListAction implements CommandAction 을 모델2에서 구현했었다.
public class TestController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("TestController - handleRequest 호출");

        // ModelAndView -> 처리하는 결과를 담아놓은 객체 (어떤 경로의 어떤 페이지로 이동하는지에 대한정보가 담겨있다)
        ModelAndView mav = new ModelAndView();

        mav.setViewName("list3"); // 이동할 페이지명 지정 : list3.jsp
        // list3.jsp 로 전송할 데이터가 있을시. (모델2 에서는 request.setAttribute("키명","값) <-> request.getAttribute("키명")
        mav.addObject("greeting", "스프링스프링스프링~~~~"); // ${키명} ${greeting}

        return mav; // 모델2에서는 return "/list3.jsp" 로 적어야 했지만 스프링에서는 viewResolver가 알아서 처리해줌.
    }
}
