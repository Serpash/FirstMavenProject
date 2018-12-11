package by.itacademy.lesson1;

import java.util.List;

public class Data {
    private Integer result;
    private List<Integer> fibonachis;

    public Data(Integer result, List<Integer> fibonachis) {
        this.result = result;
        this.fibonachis = fibonachis;
    }

    public Integer getResult() {
        return result;
    }

    public List<Integer> getFibonachis() {
        return fibonachis;
    }
}
