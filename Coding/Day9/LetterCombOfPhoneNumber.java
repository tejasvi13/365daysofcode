//Question:https://leetcode.com/problems/letter-combinations-of-a-phone-number/
class Solution {
    public List<String> letterCombinations(String d) {
        List<String>ans=new ArrayList<>();
        if(d.length()==0){
            return ans;
        }
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder sb=new StringBuilder();
        combine(sb,map,ans,d,0);
        return ans;
    }
    static void combine(StringBuilder sb,Map<Character,String>map,List<String>ans,String d,int index){
        if(index==d.length()){
            ans.add(sb.toString());
            return ;
        }
        String str=map.get(d.charAt(index));
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            combine(sb,map,ans,d,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}