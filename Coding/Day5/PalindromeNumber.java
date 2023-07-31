//Question:https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        int a[]=new int[1001];
        int i=0;
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        while(x>0){
            a[i++]=x%10;
            x/=10;
        }
        for(int j=0;j<=i/2;j++){
            if(a[j]!=a[i-j-1]){
                return false;
            }
        }
        return true;
    }
}