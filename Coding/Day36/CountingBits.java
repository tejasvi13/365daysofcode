 //Question:https://leetcode.com/problems/counting-bits/description/?envType=daily-question&envId=2023-09-01
class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=a[i>>1]+ (i&1);
        }
        return a;
    }
}