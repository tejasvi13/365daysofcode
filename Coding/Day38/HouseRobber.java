//Question:https://leetcode.com/problems/house-robber-iv/description/
class Solution {
    public int minCapability(int[] nums, int k) {
        int l=1;
        int r=1000000001;
        int n=nums.length;
        while(l<r){
            int m=(l+r)/2;
            int t=0;
            for(int i=0;i<n;i++){
                if(nums[i]<=m){
                    t+=1;
                    i++;
                }
            }
            if(t>=k){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}