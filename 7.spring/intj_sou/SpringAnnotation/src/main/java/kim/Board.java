package kim;

// 테이블명 DTO : 테이블명VO

//DTO->입력폼의 name와 반드시 같아야 한다.->액션태그때문에
public class Board {

    private int num;
    private String author, title, content, writeday;
    private int readcnt;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

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

    public String getWriteday() {
        return writeday;
    }



    public void setWriteday(String writeday) {
        this.writeday = writeday;
    }

    public int getReadcnt() {
        return readcnt;
    }

    public void setReadcnt(int readcnt) {
        this.readcnt = readcnt;
    }
}
