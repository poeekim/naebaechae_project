package action;

import kha.board.BoardDAO;
import kha.board.BoardDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContentAction implements CommandAction {
    @Override
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        
        //1. 자바코드 (content.jsp 에서 자바 코드 복사)
        // /content.do?num=3&pageNum=1
        int num=Integer.parseInt(request.getParameter("num"));
        String pageNum=request.getParameter("pageNum");

        BoardDAO dbPro=new BoardDAO();
        BoardDTO article=dbPro.getArticle(num);
        //링크문자열의 길이를 줄이기위해서
        int ref=article.getRef();
        int re_step=article.getRe_step();
        int re_level=article.getRe_level();
        System.out.println("content.do의 매개변수 확인");
        System.out.println("ref=>"+ref+",re_step=>"+re_step
                +",re_level=>"+re_level
                +",num=>"+num+",pageNum=>"+pageNum);

        //2. 처리한 결과를 request 객체에 저장
        request.setAttribute("num", num);
        request.setAttribute("pageNum", pageNum);
        request.setAttribute("article", article); // article 안에 ref, re_step, re_level 값이 들어있으므로, article 하나만 넘긴다.


        
        
        
        
        
        //3. 호출
        
        
        
        
        return "/content.jsp";
    }
}
