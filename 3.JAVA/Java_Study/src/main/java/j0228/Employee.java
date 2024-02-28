package j0228;


// 상속 예제
// 신입사원에 대한 정보를 저장하가 위한 class
public class Employee {

    // 1. 멤버변수
    String name;
    int age;
    String mf; // 성별
    String addr;
    long salary; // 급여(직원:150% 보너스, 팀장:300%보너스)

    public Employee() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMf() {
        return mf;
    }

    public void setMf(String mf) {
        this.mf = mf;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    // 2. 생성자 오버로딩

    public Employee(String name, int age, String mf, String addr, long salary) {
        super();
        this.name = name;
        this.age = age;
        this.mf = mf;
        this.addr = addr;
        this.salary = salary;
    }

    // 3.보너스를 구하는 메소드
    double bonus() {
        return salary*1.5;
    }

    void display() {
        System.out.println("============직원의정보 ==========");
        System.out.println("name = " + this.name);
        System.out.println("age = " + age);
        System.out.println("성별 = " + mf);
        System.out.println("addr = " + addr);
        System.out.println("salary = " + salary);
        System.out.println("bonus = " + this.bonus()); // 멤버변수가 없기 때문에, 메소드 호출 O

    }
}
