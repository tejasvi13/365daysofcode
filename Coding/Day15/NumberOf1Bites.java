//question:https://leetcode.com/problems/number-of-1-bits/description/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt=0;
        while(n!=0){
            int l=n& 1;
            cnt+=l;
            n=n>>>1;
        }
        return cnt;
    }
}