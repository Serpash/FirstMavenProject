package by.itacademy.lesson1;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumbersTest {

    @Test
    public void test1() {
        Assert.assertEquals("Not equals 1", new Integer(1), FibonacciNumbers.getFibonacci(1).getResult());
    }
}
