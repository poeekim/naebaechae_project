package studentdb;

// String, int 등을 Wrapper class 스타일인 Integer 로 DTO or VO 에서 작성
public class Student {

    private Integer id; // 학생번호
    private Integer age;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
