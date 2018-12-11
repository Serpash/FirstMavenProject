package by.itacademy.lesson1;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumbers {

    public static Data getFibonacci(Integer index) {
        List<Integer> list = new ArrayList<Integer>();
        int sum  = 0;
        for (int i = 0; i <= index; i++) {
            if (i==0) {
                list.add(0);
            } else if (i == 1 || i == 2) {
                list.add(1);
                sum+=1;
            } else {

            }

        }
        return new Data(sum, list);
    }
}
