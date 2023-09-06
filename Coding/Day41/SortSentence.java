//Question:https://leetcode.com/problems/sorting-the-sentence/description/
class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> map=new HashMap<>();
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++){
            int n=str[i].length()-1;
            int m=str[i].charAt(n)-'0';
            String st=str[i].substring(0,n);
            map.put(m,st);
        }
        String t="";
        for(Map.Entry<Integer,String> u: map.entrySet()){
            t+= u.getValue()+" ";
        }
        return t.trim();
    }
}