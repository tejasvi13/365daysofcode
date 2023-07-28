//Question:https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
          if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>sum+nums[i]){
                sum=nums[i];
            }
            else{
                sum=sum+nums[i];
            }
            if(max<sum){
                max=sum;
            }
       }
        return max;
    }
}