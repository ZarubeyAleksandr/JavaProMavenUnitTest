package org.unittest;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] frequency = new int[101];

        for (int num : nums) {
            count += frequency[num];
            frequency[num]++;
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs solution = new NumberOfGoodPairs();

        int[] nums1 = {1, 2, 3, 1, 1, 3};
        int result1 = solution.numIdenticalPairs(nums1);
        System.out.println("Example 1: " + result1);

        int[] nums2 = {1, 1, 1, 1};
        int result2 = solution.numIdenticalPairs(nums2);
        System.out.println("Example 2: " + result2);

        int[] nums3 = {1, 2, 3};
        int result3 = solution.numIdenticalPairs(nums3);
        System.out.println("Example 3: " + result3);
    }


}
