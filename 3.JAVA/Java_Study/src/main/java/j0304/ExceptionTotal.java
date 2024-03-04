package j0304;

public class ExceptionTotal {
    public static void main(String[] args) {

        System.out.println("매개변수 2개를 입력받는다(동적배열)");

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("a = " + a);
            System.out.println("a / b" + (a / b));

        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("수를 0으로 나눌 수 없다");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("반드시 2개를 입력해야 한다");
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("반드시 숫자를 입력해야 한다");
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("exception 과 상관없이 무조건.. 반드시 실행되어야 할 구문은 finally 에 넣어준다.");
        }
        
    }
}
