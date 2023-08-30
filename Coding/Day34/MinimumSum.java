//Question:https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/
class Solution {
    public int minimumSum(int num) {
        int[] dig=new int[4];
        int a=0;
        while(num>0){
            dig[a++]=num%10;
            num/=10;
        }
        Arrays.sort(dig);
        int n=dig[0]*10 + dig[2];
        int m=dig[1]*10+ dig[3];
        return n+m;
    }
}