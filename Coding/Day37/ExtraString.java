//Question:https://leetcode.com/problems/extra-characters-in-a-string/description/?envType=daily-question&envId=2023-09-02
class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int max=s.length()+1;
        int dp[]=new int[max];
        for(int i=0;i<max;i++){
            dp[i]=max;
        }
        dp[0]=0;
        Set<String> a=new HashSet<>(Arrays.asList(dictionary));
        for(int i=1;i<max;i++){
            dp[i]=dp[i-1]+1;
            for(int j=1;j<=i;j++){
                String st=s.substring(i-j,i);
                if(a.contains(st)){
                    dp[i]=Math.min(dp[i],dp[i-j]);
                }
            }
        }
        return dp[max-1];
    }
}