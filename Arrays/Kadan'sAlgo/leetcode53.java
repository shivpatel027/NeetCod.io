public class leetcode53 {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++) {
            currSum = Math.max(currSum, 0);
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
