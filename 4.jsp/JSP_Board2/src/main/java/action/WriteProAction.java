package action;

import kha.board.BoardDAO;
import kha.board.BoardDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;

public class WriteProAction implements CommandAction {




    @Override
    public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

        // 1. writePro.jsp 에서 처리하는 자바코드 복사

        request.setCharacterEncoding("utf-8");

        //<jsp:useBean id="article" class="kha.board.BoardDTO" />
        BoardDTO article = new BoardDTO();
        //<jsp:setProperty name="article" property="*"/>

        article.setNum(Integer.parseInt(request.getParameter("num")));//num
        article.setWriter(request.getParameter("writer"));
        article.setEmail(request.getParameter("email"));
        article.setSubject(request.getParameter("subject"));
        article.setPasswd(request.getParameter("passwd"));
        //9개->12개(readcount(0) default,작성날짜,원격 ip주소)
        article.setReg_date(new Timestamp(System.currentTimeMillis()));//오늘 날짜 계산해서 수동으로 저장
        article.setRef(Integer.parseInt(request.getParameter("ref")));
        article.setRe_step(Integer.parseInt(request.getParameter("re_step")));
        article.setRe_level(Integer.parseInt(request.getParameter("re_level")));
        article.setContent(request.getParameter("content"));
        article.setIp(request.getRemoteAddr());//원격 ip 주소

        BoardDAO dbPro=new BoardDAO();
        dbPro.insertArticle(article);//입력+계산한값을 전부 저장한값을 전달
        //3. 호출
        return "writePro.jsp";
    }
}
