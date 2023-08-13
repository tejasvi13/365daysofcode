//Question:https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/
class Solution {
    public boolean validPartition(int[] nums) {
        int n=nums.length;
        boolean dp[]=new boolean[3];
        dp[0]=true;
        for(int i=0;i<n;i++){
            int s=i+1;
            boolean ans=false;
            if(i>0 && nums[i]==nums[i-1]){
                ans=ans|dp[(s-2)%3];
            }
            if(i>1 && nums[i]==nums[i-1] && nums[i]==nums[i-2]) {
                ans|=dp[(s - 3) % 3];
            }
            if (i>1 && nums[i]==nums[i-1]+1 && nums[i]==nums[i-2]+2) {
                ans |= dp[(s-3) % 3];
            }
            dp[s%3]=ans;
        }
        return dp[n%3];
        
    }
}