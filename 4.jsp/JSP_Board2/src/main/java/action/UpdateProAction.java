package action;

import kha.board.BoardDAO;
import kha.board.BoardDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;

public class UpdateProAction implements CommandAction {


    @Override
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

        System.out.println("----------- UpdateProAction.java ------------");

        // 1. updatePro.jsp 에서 처리하는 자바코드 복사
        request.setCharacterEncoding("utf-8");

        // 추가(수정된 게시물로 페이지를 이동시키기 위함)
        String pageNum = request.getParameter("pageNum"); // hidden 으로 받아옴
        System.out.println("pageNum = " + pageNum);

        BoardDTO article = new BoardDTO();

        article.setNum(Integer.parseInt(request.getParameter("num")));// hidden 으로 받아옴
        article.setWriter(request.getParameter("writer"));
        article.setEmail(request.getParameter("email"));
        article.setSubject(request.getParameter("subject"));
        article.setContent(request.getParameter("content"));
        article.setPasswd(request.getParameter("passwd"));


        BoardDAO dbPro=new BoardDAO();
       int check = dbPro.updateArticle(article);//입력+계산한값을 전부 저장한값을 전달
        
        // 2. 처리결과 저장
        request.setAttribute("pageNum", pageNum); // 수정게시물의 페이지 이동 
        request.setAttribute("check",check); // 데이터 수정 성공 유무
        //3. 페이지 이동
        return "/updatePro.jsp";
    }
}
