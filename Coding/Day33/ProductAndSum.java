//Question:https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
class Solution {
    public int subtractProductAndSum(int n) {
        int a[]= new int[100001];
        int k=0;
        while(n!=0){
            a[k++]=n%10;
            n/=10;
        }
        int sum=0,pro=1;
        for(int i=0;i<k;i++){
            sum+=a[i];
            pro*=a[i];
        }
        return pro-sum;
    }
}