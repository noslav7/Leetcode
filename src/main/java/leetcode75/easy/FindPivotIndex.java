package leetcode75.easy;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int sumExceptZeroIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            sumExceptZeroIndex += nums[i];
        }
        if (sumExceptZeroIndex == 0) {
            System.out.println(0);
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            int currentIndex = i;
            while (i > 0) {
                leftSum += nums[--i];
            }

            i = currentIndex;
            while (i < nums.length - 1) {
                rightSum += nums[++i];
            }

            i = currentIndex;
            if (rightSum == leftSum) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
}

    /*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
     */
