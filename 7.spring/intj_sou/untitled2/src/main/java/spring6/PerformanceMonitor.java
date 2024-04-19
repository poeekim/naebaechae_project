package spring6;

import java.util.List;

// List 객체를 가져오는 경우 : <list></list>
public class PerformanceMonitor {
    private List<Double> number;

    public void setNumber(List<Double> number) {
        this.number = number;
        System.out.println("setNumber() 호출 => " + number);
    }
}
