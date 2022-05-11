package huh.enterprises.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonConstructibleChangeTest {

    // 6 days 16h
    @Test
    void test() {
        assertThat(nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22}))
                .isEqualTo(20);
    }

    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        return -1;
    }
}
