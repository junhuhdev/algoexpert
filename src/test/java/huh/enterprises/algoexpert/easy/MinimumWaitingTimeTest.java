package huh.enterprises.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumWaitingTimeTest {

    @Test
    void test() {
        assertThat(minimumWaitingTime(new int[]{3, 2, 1, 2, 6}))
                .isEqualTo(17);
    }

    public int minimumWaitingTime(int[] queries) {
        if (queries.length == 0 || queries.length == 1) {
            return 0;
        }
        // Sort the array descending
        Integer[] values = Arrays.stream(queries).boxed().toArray(Integer[]::new);
        Arrays.sort(values);
        int min = 0;
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (i != 0) {
                min += values[i - 1];
                sum.add(min);
            }
        }
        // Write your code here.
        return sum.stream().mapToInt(Integer::intValue).sum();
    }
}
