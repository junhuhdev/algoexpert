package huh.enterprises.algoexpert;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortedSquaredArrayTest {

    @Test
    void test_1() {
        assertThat(sortedSquaredArray(new int[]{1, 2, 3, 5, 6, 8, 9}))
                .isEqualTo(new int[]{1, 4, 9, 25, 36, 64, 81});
    }

    @Test
    void test_2() {
        assertThat(sortedSquaredArray(new int[]{-2, -1}))
                .isEqualTo(new int[]{1, 4});
    }

    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        return result;
    }
}
