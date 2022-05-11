package huh.enterprises.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumWaitingTimeTest {

    @Test
    void test() {
        assertThat(minimumWaitingTime(new int[]{3, 2, 1, 2, 6}))
                .isEqualTo(17);
    }

    public int minimumWaitingTime(int[] queries) {
        // Write your code here.
        return -1;
    }
}
