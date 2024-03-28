package action;

import kha.board.BoardDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteProAction implements CommandAction {

    @Override
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

        // 1. deletePro.jsp 에서 자바 코드 붙여오기
        int num = Integer.parseInt(request.getParameter("num")); // hidden
        String pageNum = request.getParameter("pageNum");
        //추가
        String passwd = request.getParameter("passwd");

        BoardDAO dbPro = new BoardDAO();
        int check = dbPro.deleteArticle(num,passwd);// 1 : 성공

        // 2. 서버에 등록
        request.setAttribute("pageNum", pageNum);
        request.setAttribute("check",check);
        // 3. 페이지 이동
        return "/deletePro.jsp";
    }
}
