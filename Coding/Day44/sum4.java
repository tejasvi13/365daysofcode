//Question:https://leetcode.com/problems/combination-sum-iv/description/?envType=daily-question&envId=2023-09-09
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        long[] dp = new long[target + 1];
        dp[0] = 1;        
        for (int i= 1;i<=target;i++) {
            for(int j= 0;j< nums.length;j++) {
                int c= nums[j];
                if (i-c>= 0) {
                    dp[i] += dp[i-c];
                }
            }
        }
        return (int)dp[target];
    }
}