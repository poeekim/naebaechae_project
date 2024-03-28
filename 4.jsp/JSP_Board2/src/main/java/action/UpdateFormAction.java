package action;

import kha.board.BoardDAO;
import kha.board.BoardDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateFormAction implements CommandAction {

    @Override
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

        int num = Integer.parseInt(request.getParameter("num"));
        String pageNum = request.getParameter("pageNum");

        BoardDAO dbPro = new BoardDAO();
        BoardDTO article = dbPro.updateGetArticle(num);

        System.out.println("------ updateForm.do's variable check -----------");
        System.out.println("pageNum = " + pageNum);
        System.out.println("num = " + num);

        request.setAttribute("pageNum", pageNum);
        request.setAttribute("article", article); // article 안에 이미 num 이 있음. -> ${article.num}
        // request.setAttribute("num",num); -> updateForm.jsp 내에서 ${num} 으로 작성됨 (근데 위에 article 로 통째로 넘길 예정이라 주석 처리)

        // 3. 호출
        return "/updateForm.jsp";
    }
}
