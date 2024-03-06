package j0306;

import java.util.*;

/*
* List : ArrayList, Random 사용.
*
*
* */
public class ListLotto {

    Integer bonus; // 숫자객체 int를 사용하면 안됨.
    List<Integer> lotto = new ArrayList<>(); // 자식객체를 통해서 인터페이스 객체 생성가능
    // List<Integer> lotto = new List<>(); 오류 발생

    // 1. 6개 숫자를 랜덤으로 출력
    public void setup() { // 0~45 사이의 숫자에서 랜덤

        // Math.random() : 난수를 만들어주는 메서드. 중복된 숫자가 나올 수 있음.(seed 값으로 인함)
        Random random = new Random(); // seed 값을 변경하면 중복확률이 낮아짐.
        while (bonus == null) {
            // nextInt(숫자) : 숫자범위내의 임의의 수를 출력
            int num = random.nextInt(45) + 1; // 0~45 사이의 범위 내에서 임의의 수를 출력하라.
            //System.out.println("num = " + num);

            if (!lotto.contains(num)) { // 중복된 숫자가 아니라면
                // 6개가 들어있지 않다면
                if (lotto.size() < 6) {
                    lotto.add(num);
                }else {
                    bonus=num;
                }
            }
        }
        Collections.sort(lotto); // 오름차순 정렬
        System.out.println("lotto.size : " + lotto.size());
        
    }

    @Override
    public String toString() {
        return "로또당첨 번호 : " + lotto + ", 보너스 번호 : " + bonus;
    }

    public static void main(String[] args) {
        ListLotto lotto = new ListLotto();
        lotto.setup(); // 6개의 번호 구하기
        System.out.println(lotto); // 오버라이딩을 해서 주소값이 아닌, 값 자체가 출력됨.

    }
}
