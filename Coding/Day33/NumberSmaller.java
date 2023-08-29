//Question:https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int c=0;
        int r[]=new int[nums.length],k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    c++;
                }
            }
            r[i]=c;
            c=0;
        }
        return r;
    }
}