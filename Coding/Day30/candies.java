//Question:https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        List<Boolean> a=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int t=candies[i]+extraCandies;
            if(t>=max){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a;
    }
}