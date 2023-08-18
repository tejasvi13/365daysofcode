//Question:https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                    cnt++;
            }
        }
        return cnt;
    }
}
