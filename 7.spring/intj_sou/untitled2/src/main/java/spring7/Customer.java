package spring7;

import java.util.Set;

// 고객, 도서 (서버에 접속) : ip 주소(도메인이름), 접속시간설정(spring8)
// 책대여수
public class Customer {

    private Set<Integer> subSet; // 책대여수(중복x)



    public Customer(Set<Integer> subSet) {
        this.subSet = subSet;
    }

    @Override
    public String toString() {
        return "Customer[subSet=" + subSet +"]";
    }

    public void setSubSet(Set subSet) {
        this.subSet = subSet;
    }

    public Set getSubSet() {
        return subSet;
    }
}
