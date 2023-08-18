//Question:https://leetcode.com/problems/concatenation-of-array/description/
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            num[nums.length+i]=nums[i];
        }
        return num;
    }
}