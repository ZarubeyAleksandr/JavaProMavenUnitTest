package org.unittest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberOfGoodPairsTest {

    @Test
    public void numIdenticalPairsTest1() {
        NumberOfGoodPairs solution = new NumberOfGoodPairs();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = solution.numIdenticalPairs(nums);
        assertEquals(4, result);
    }

    @Test
    public void numIdenticalPairsTest2() {
        NumberOfGoodPairs solution = new NumberOfGoodPairs();
        int[] nums = {1, 1, 1, 1};
        int result = solution.numIdenticalPairs(nums);
        assertEquals(6, result);
    }

    @Test
    public void numIdenticalPairsTest3() {
        NumberOfGoodPairs solution = new NumberOfGoodPairs();
        int[] nums = {1, 2, 3};
        int result = solution.numIdenticalPairs(nums);
        assertEquals(0, result);
    }

    @Test
    public void emptyArrayTest() {
        NumberOfGoodPairs solution = new NumberOfGoodPairs();
        int[] nums = {};
        int result = solution.numIdenticalPairs(nums);
        assertEquals(0, result);
    }

}
