package huh.enterprises.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

/**
 * fib(n) = fib(n-1) + fib(n-2) if n > 2
 */
public class NthFibonacciTest {

    @Test
    void test_1() {
        assertThat(getNthFib(2)).isEqualTo(1);
        assertThat(getNthFib(6)).isEqualTo(5);
    }

    @Test
    void test_2() {
        assertThat(getNthFib(2)).isEqualTo(1);
        assertThat(getNthFib(6)).isEqualTo(5);
    }

    public static int calculateFibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        for (int i = 3; i <= n; i++) {
            map.put(i, map.get(i - 1) + map.get(i - 2));
        }
        return map.get(n);

    }


    // recursive
    public static int getNthFib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return getNthFib(n - 1) + getNthFib(n - 2);
    }
}
