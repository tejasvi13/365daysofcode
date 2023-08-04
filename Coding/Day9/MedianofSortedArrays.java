//Question:https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int n[]=new int[n1.length+n2.length];
        for(int i=0;i<n.length;i++){
            if(i<n1.length){
                n[i]=n1[i];
            }
            else{
                n[i]=n2[i-n1.length];
            }
        }
        Arrays.sort(n);
        if (n.length%2==0) return (float)(n[n.length/2-1] + n[n.length/2])/2;
        else return n[n.length/2];
    }
}