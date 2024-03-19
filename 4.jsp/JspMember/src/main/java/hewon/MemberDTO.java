package hewon;
/*
* 웹상에서 입력받은 데이터를 테이블의 필드에 맞게 1:1 대응 관계로 설계된 클래스 = 자바 데이터 저장빈
*  테이블명DTO or 테이블명VO 라 쓰며 VO 는 스프링에서 자주 쓰인다.
*
* */
public class MemberDTO {

    private String mem_id; // 아이디
    private String mem_passwd; // 비번
    private String mem_name; // 이름
    private String mem_email; // 이메일 
    private String mem_phone; // 전화번호

    public String getMem_job() {
        return mem_job;
    }

    public void setMem_job(String mem_job) {
        this.mem_job = mem_job;
    }

    private String mem_zipcode; // 우편번호
    private String mem_address; // 주소
    private String mem_job; // 직업


    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id.trim();
    }

    public String getMem_passwd() {
        return mem_passwd;
    }

    public void setMem_passwd(String mem_passwd) {
        this.mem_passwd = mem_passwd.trim();
    }

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public String getMem_email() {
        return mem_email;
    }

    public void setMem_email(String mem_email) {
        this.mem_email = mem_email;
    }

    public String getMem_phone() {
        return mem_phone;
    }

    public void setMem_phone(String mem_phone) {
        this.mem_phone = mem_phone;
    }

    public String getMem_zipcode() {
        return mem_zipcode;
    }

    public void setMem_zipcode(String mem_zipcode) {
        this.mem_zipcode = mem_zipcode;
    }

    public String getMem_address() {
        return mem_address;
    }

    public void setMem_address(String mem_address) {
        this.mem_address = mem_address;
    }


}
