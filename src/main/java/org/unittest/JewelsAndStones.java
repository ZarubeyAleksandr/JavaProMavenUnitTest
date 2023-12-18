package org.unittest;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        JewelsAndStones solution = new JewelsAndStones();

        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        int result1 = solution.numJewelsInStones(jewels1, stones1);
        System.out.println("Example 1: " + result1);

        String jewels2 = "z";
        String stones2 = "ZZ";
        int result2 = solution.numJewelsInStones(jewels2, stones2);
        System.out.println("Example 2: " + result2);

    }

}
