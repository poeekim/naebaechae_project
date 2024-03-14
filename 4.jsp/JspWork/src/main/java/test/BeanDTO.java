package test; // package 상위패키지명.하위패키지명...; -> 기능별로  분리

/*
*   자바빈즈 -> 웹상(jsp)에서 불러다 사용하는 클래스를 뜻함
*  규칙)
* 1. pacakge 를 이용해서 기능별로 클래스를 분리한다.
* 2. public class 로 작성한다.(= jsp(외부)에서 접근해야하므로)
* 3. 멤버변수앞에 private를 붙인다(캡슐화)
* 4. 멤버변수 갯수만큼 Setter, Getter Method 를 작성한다.
*
* */

public class BeanDTO {

    private String name = "";
    private String addr = "";
    public void setName(String name) {
        this.name = name;
        System.out.println("setName() -> name = " + name);
    }
    public void setAddr(String addr) {
        this.addr = addr;
        System.out.println("setAddr() -> addr = " + addr);
    }
    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }
}
