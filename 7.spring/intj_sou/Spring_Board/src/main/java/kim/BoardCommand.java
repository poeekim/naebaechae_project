package kim;

// BoardDTO(or VO) : 하나의 레코드에 관련된 필드와 연관이 있는 클래스
// BoardCommand : 실질적으로 사용자로부터 값을 입력받는 필드로만 구성된 필요

public class BoardCommand {

    private String author, title, content;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
