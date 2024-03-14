package calc;

public class CalcBean {
    private int num1;
    private int num2;
    private String operator;


    public int getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = Integer.parseInt(num1);
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = Integer.parseInt(num2) ;
    }

    public String getOperator(String operator) {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String calculator(String operator) {
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
    }
}
