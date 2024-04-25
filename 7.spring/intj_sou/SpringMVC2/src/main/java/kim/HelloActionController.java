package kim;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// /hello.do -> handleRequest메소드 때문에 상속 받음.
public class HelloActionController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("HelloActionController - handleRequest 호출");

        // ModelAndView -> 처리하는 결과를 담아놓은 객체 (어떤 경로의 어떤 페이지로 이동하는지에 대한정보가 담겨있다)
        ModelAndView mav = new ModelAndView();

        mav.setViewName("hello"); // 이동할 페이지명 지정 : hello.jsp
        // hello.jsp 로 전송할 데이터가 있을시. (모델2 에서는 request.setAttribute("키명","값) <-> request.getAttribute("키명")
        mav.addObject("message", "클릭 클릭"); // ${키명} ${greeting}

        return mav; // 모델2에서는 return "/hello.jsp" 로 적어야 했지만 스프링에서는 viewResolver가 알아서 처리해줌.
    }
}
