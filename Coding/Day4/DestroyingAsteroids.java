//Question:https://leetcode.com/problems/destroying-asteroids/description/
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int cnt=0;
        long sum=(long)mass;
        
        for(int i=0;i<asteroids.length;i++){
            long dest=(long)asteroids[i];
            if(sum>=dest){
                cnt+=1;
                sum+=dest;
            }
        }
        if(cnt==asteroids.length){
            return true;
        }
        return false;
    }
}