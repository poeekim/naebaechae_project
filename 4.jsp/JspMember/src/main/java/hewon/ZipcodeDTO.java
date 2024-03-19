package hewon;
/*
* DTO : 테이블 하나 생성할 때마다 DTO 클래스 하나씩 작성을 해야함.
*       : 1. 테이블의 필드별로 값들을 저장, 출력하기 위함.
*         2. 메소드의 매개변수와 반환형 때문에 필요
* DAO : 테이블을 만들 때마다 무조건 작성하지 않음 (상황에 따라 작성하면 됨)
*       MemberDAO(회원에 관련된 모든 메소드) 가 있으므로, ZipcodeDAO (우편번호 찾는 메소드 1개)를 위해서 DAO 를 만들 필요는 X
*
* */
public class ZipcodeDTO {
        // 우편번호  시/도, 구/소도시, 동/면/리, 그외주소
    private String zipcode,area1,area2,area3, area4;

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getArea1() {
        return area1;
    }

    public void setArea1(String area1) {
        this.area1 = area1;
    }

    public String getArea2() {
        return area2;
    }

    public void setArea2(String area2) {
        this.area2 = area2;
    }

    public String getArea3() {
        return area3;
    }

    public void setArea3(String area3) {
        this.area3 = area3;
    }

    public String getArea4() {
        return area4;
    }

    public void setArea4(String area4) {
        this.area4 = area4;
    }
}
