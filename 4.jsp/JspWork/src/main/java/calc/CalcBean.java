package calc; // 1. package 상위패키지.하위패키지...(기능별로 분리)

// 2. public class 클래스명 (why?? 외부(calResult.jsp)에서 접근해야하므로!)
public class CalcBean {

    // 3. 입력받아서 저장해야하므로 private 멤버변수로 값을 은닉하고 보호
    private int num1;
    private int num2;
    private String operator="";
    // 추가
    private int result; // num1+num2 의 결과값을 저장할 멤버변수
/*    public int calculate() {
        return (num1+num2);
    } -> 반환값이 있는 메소드로 만들 때는 result 변수 필요 X */
    public void calculate() throws Exception{ // calResult.jsp 에서 호출

        // +
        if (operator.equals("+")) {
            result = num1 + num2;
        }
        // -
        if (operator.equals("-")) {
            result = num1 - num2;
        }
        // *
        if (operator.equals("*")) {
            result = num1 * num2;
        }
        // /
        if (operator.equals("/")) {
            result = num1 / num2;
        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
        System.out.println("setNum1호출 = " + num1);
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
        System.out.println("setNum2 = " + num2);
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getResult() { // calResult.jsp 에서 호출
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

   /*public String calculator(String operator) {
        long result = 0;

        switch (operator) {

            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = (long) num1 * num2;
                break;

            case "/":
                result = num1 / num2;
                break;
        }
        return String.valueOf(result);
    }*/
}
