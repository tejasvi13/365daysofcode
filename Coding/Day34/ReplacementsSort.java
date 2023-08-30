//Question:https://leetcode.com/problems/minimum-replacements-to-sort-the-array/description/
class Solution {
    public long minimumReplacement(int[] nums) {
        long a=0;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<=nums[i+1]){
                continue;
            }
            long e=(long)(nums[i]+nums[i+1]-1)/(long)nums[i+1];
            a+=e-1;
            nums[i]=nums[i]/(int)e;
        }
        return a;
    }
}