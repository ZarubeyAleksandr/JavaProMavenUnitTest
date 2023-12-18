package org.unittest;

public class MaximumBalloons {

    public int maxNumberOfBalloons(String text) {

        int[] charCount = new int[26];

        for (char ch : text.toCharArray()) {
            charCount[ch - 'a']++;
        }

        int minCount = charCount['b' - 'a'];
        minCount = Math.min(minCount, charCount[0]);
        minCount = Math.min(minCount, charCount['l' - 'a'] / 2);
        minCount = Math.min(minCount, charCount['o' - 'a'] / 2);
        minCount = Math.min(minCount, charCount['n' - 'a']);

        return minCount;
    }

    public static void main(String[] args) {
        MaximumBalloons solution = new MaximumBalloons();

        String text1 = "nlaebolko";
        int result1 = solution.maxNumberOfBalloons(text1);
        System.out.println("Example 1: " + result1);

        String text2 = "loonbalxballpoon";
        int result2 = solution.maxNumberOfBalloons(text2);
        System.out.println("Example 2: " + result2);

        String text3 = "leetcode";
        int result3 = solution.maxNumberOfBalloons(text3);
        System.out.println("Example 3: " + result3);
    }
}
