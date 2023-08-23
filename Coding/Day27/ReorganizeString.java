//Question:https://leetcode.com/problems/reorganize-string/description/
class Solution {
    public String reorganizeString(String s) {
        var c=new char[26];
        for(char ch:s.toCharArray()){
            c[ch-'a']++;
        }
        int max=0,l=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>max){
                max=c[i];
                l=i;
            }
        }
        if(max>(s.length()+1)/2){
            return "";
        }
        var a=new char[s.length()];
        int j=0;
        while(c[l]!=0){
            a[j]=(char)(l+'a');
            j+=2;
            c[l]--;
        }
        for(int i=0;i<c.length;i++){
            while(c[i]>0){
                if(j>=s.length()){
                    j=1;
                }
                a[j]=(char)(i+'a');
                j+=2;
                c[i]--;
            }
        }
        return String.valueOf(a);

    }
}