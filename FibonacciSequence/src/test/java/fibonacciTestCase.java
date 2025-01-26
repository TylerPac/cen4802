package test.java;
import main.java.Fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class fibonacciTestCase {

    @Test
    public void testFibonacci() {
        // Test case for n = 0
        assertEquals(0, Fibonacci.fibonacci(0), "Fibonacci(0) should be 0");

        // Test case for n = 1
        assertEquals(1, Fibonacci.fibonacci(1), "Fibonacci(1) should be 1");

        // Test case for n = 2
        assertEquals(1, Fibonacci.fibonacci(2), "Fibonacci(2) should be 1");

        // Test case for n = 5
        assertEquals(5, Fibonacci.fibonacci(5), "Fibonacci(5) should be 5");

        // Test case for n = 10
        assertEquals(55, Fibonacci.fibonacci(10), "Fibonacci(10) should be 55");
    }
}
