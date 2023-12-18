package org.unittest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumBalloonsTest {
    @Test
    public void maximumBalloonsTest1() {
        MaximumBalloons solution = new MaximumBalloons();
        String text = "nlaebolko";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(1, result);
    }

    @Test
    public void maximumBalloonsTest2() {
        MaximumBalloons solution = new MaximumBalloons();
        String text = "loonbalxballpoon";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(2, result);
    }

    @Test
    public void maximumBalloonsTes3() {
        MaximumBalloons solution = new MaximumBalloons();
        String text = "leetcode";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(0, result);
    }

    @Test
    public void emptyStringTest() {
        MaximumBalloons solution = new MaximumBalloons();
        String text = "";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(0, result);
    }

    @Test
    public void noBalloonsTest() {
        MaximumBalloons solution = new MaximumBalloons();
        String text = "xyz";
        int result = solution.maxNumberOfBalloons(text);
        assertEquals(0, result);
    }

}
