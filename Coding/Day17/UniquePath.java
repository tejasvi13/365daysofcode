//Question:https://leetcode.com/problems/unique-paths/description/
class Solution {
    public int uniquePaths(int m, int n) {
        int c=n+m-2;
        int r=m-1;
        long t=1;
        for(int i=1;i<=r;i++){
            t=t*(c-r+i)/i;
        }
        return (int)t;
    }
}