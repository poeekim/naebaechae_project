package j0228;

class Manager extends Employee{
    String department; // 부서명
    Employee sub[]; // 객체배열 : 객체만 저장되는 배열(신입사원의 정보만 저장되는 배열)

    Manager(){} // 기본생성자
    Manager(String name, int age, String mf, long salary, String addr, String department){
        super(name, age, mf, addr, salary); // Employee를 바라보고있다.
        // 부모 Employee 의 63~67 row 와 중복적인 코딩이 생기므로 아래 11~15 row 를 주석처리를 한다. -> 부모의 생성자가 자식 생성자 대신 저장해주도록 하자.
       /* this.name = name;
        this.age=age;
        this.mf = mf;
        this.salary = salary;
        this.addr = addr;*/
        this.department = department;
    }
    
        // 부모의 내용을 추가해서 새로 수정
        double bonus() {
            return salary*3.0;
        }
        void display() {
            super.display();
            /*System.out.println("============직원의정보 ==========");
            System.out.println("name = " + this.name);
            System.out.println("age = " + age);
            System.out.println("성별 = " + mf);
            System.out.println("addr = " + addr);
            System.out.println("salary = " + salary);
            System.out.println("bonus = " + this.bonus());*/
            // 부모의 display 에는 department 언급이 없으므로, 오버라이딩으로 자식쪽에서 display 메소드를 수정한다.
            System.out.println("department = " + department);
            System.out.println("부하직원의 수 = "+sub.length);

        }

    /*
    String name;
    int age;
    String mf; // 성별
    String addr;
    long salary;
*/
}
public class Company {
    public static void main(String[] args) {

        // 1. 신입사원 3명 배정
        Employee e1 = new Employee("홍길동", 23, "남", "서울시 강남구", 1500);
        Employee e2 = new Employee("테스트", 35, "남", "대전시 중구", 1700);
        Employee e3 = new Employee("임시", 30, "여", "서울시 논현구", 1800);
        // 2. 부서배치(개발부)
        Manager m1 = new Manager("임시테스트", 23, "남", 3500, "서울시 강동구", "개발1");
        m1.sub = new Employee[3]; // Employee 데이터만 따로 저장할 공간 3개 생성
        m1.sub[0] = e1;
        m1.sub[1] = e2;
        m1.sub[2] = e3;

        for (int i = 0;i< m1.sub.length; i++) {
            System.out.println("직원명 = "+ m1.sub[i].name);
            System.out.println("나이 = " + m1.sub[i].age);
            m1.sub[i].display(); // 전체정보 출력
        }
        m1.display(); // 팀장
    }
}
