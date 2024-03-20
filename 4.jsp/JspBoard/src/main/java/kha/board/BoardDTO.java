package kha.board;

import java.sql.*;

public class BoardDTO {
    private int num; // 게시물 번호 - PK
    private String writer, subject, email, content, passwd; // 작성자, 글제목, 이메일, 글내용, 암호(글수정, 글삭제하기 위해서 필요)
    private Timestamp reg_date; // 작성날짜 (작성자가 작성하지 않고, 시스템 내 시스템으로 설정됨) -> now()
    private int readcount; // 조회수 (default = 0)
    private String ip; // 작성자 ip 주소

    // -------------------------------- ↑↑↑↑↑↑ 일반 유저가 게시판에 글을 쓰기 위해 필요한 변수
    // 공지사항 게시판의 작성은 관리자만 가능하다. ( 공지사항 게시판 , 자유게시판 <-> 회원제 게시판 )
    // -------------------------------- ↓↓↓↓↓↓ 답글?을 달기 위해서 필요한 변수
    private int ref; // 글 그룹번호
    private int re_step; // 답변글의 순서를 지정(=같은 그룹의 답변글 순서)
    private int re_level; // 답변글의 답변에 대한 깊이(=depth)

    // 자료실 -> 파일첨부 -> String fileName;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Timestamp getReg_date() {
        return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }

    public int getReadcount() {
        return readcount;
    }

    public void setReadcount(int readcount) {
        this.readcount = readcount;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public int getRe_step() {
        return re_step;
    }

    public void setRe_step(int re_step) {
        this.re_step = re_step;
    }

    public int getRe_level() {
        return re_level;
    }

    public void setRe_level(int re_level) {
        this.re_level = re_level;
    }
}
