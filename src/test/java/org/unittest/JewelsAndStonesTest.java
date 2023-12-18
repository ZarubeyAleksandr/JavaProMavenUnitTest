package org.unittest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {

    @Test
    public void jewelsAndStonesTest1() {
        JewelsAndStones solution = new JewelsAndStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = solution.numJewelsInStones(jewels, stones);
        assertEquals(3, result);
    }

    @Test
    public void jewelsAndStonesTest2() {
        JewelsAndStones solution = new JewelsAndStones();
        String jewels = "z";
        String stones = "ZZ";
        int result = solution.numJewelsInStones(jewels, stones);
        assertEquals(0, result);
    }

    @Test
    public void emptyStringsTest() {
        JewelsAndStones solution = new JewelsAndStones();
        String jewels = "";
        String stones = "";
        int result = solution.numJewelsInStones(jewels, stones);
        assertEquals(0, result);
    }

    @Test
    public void noJewelsInStonesTest() {
        JewelsAndStones solution = new JewelsAndStones();
        String jewels = "abc";
        String stones = "DEF";
        int result = solution.numJewelsInStones(jewels, stones);
        assertEquals(0, result);
    }

    @Test
    public void allStonesAreJewelsTest() {
        JewelsAndStones solution = new JewelsAndStones();
        String jewels = "abc";
        String stones = "abcabc";
        int result = solution.numJewelsInStones(jewels, stones);
        assertEquals(6, result);
    }


}
