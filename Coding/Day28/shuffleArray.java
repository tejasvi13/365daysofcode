//Question:https://leetcode.com/problems/shuffle-the-array/description/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[n*2];
        int t=n;
        for(int i=0;i<t;i++){
            a[i+i]=nums[i];
            a[i+i+1]=nums[n++];
        }
        return a;
    }
}