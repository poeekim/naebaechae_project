package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteFormAction implements CommandAction {


    @Override
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

        // 1. deleteForm.jsp 에서 자바코드 이동
        //deleteForm.jsp?num=2&pageNum=1
        int num=Integer.parseInt(request.getParameter("num"));
        String pageNum=request.getParameter("pageNum");
        System.out.println("deleteForm.do의 매개변수확인");
        System.out.println("num=>"+num+",pageNum=>"+pageNum);

        // 2. 결과를 서버에 저장
        request.setAttribute("num", num);
        request.setAttribute("pageNum", pageNum);

        // 3. 페이지 이동
        return "/deleteForm.jsp";
    }
}
