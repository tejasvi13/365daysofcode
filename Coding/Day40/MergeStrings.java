//Question:https://leetcode.com/problems/merge-strings-alternately/description/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=word1.length()+ word2.length();
        int i,j;
        char[] arr =new char[l];
        if (word1.length()<word2.length()) {
            j =0;
            for (i =0;i<word1.length();i++) {
                arr[j]=word1.charAt(i);
                arr[j+1]=word2.charAt(i);
                j+=2;
            }
            while(j <l){
                arr[j++]=word2.charAt(i++);
            }
        }
        else{
            j =0;
            for (i =0;i<word2.length();i++) {
                arr[j]=word1.charAt(i);
                arr[j+1]=word2.charAt(i);
                j+=2;
            }
            while (j<l) {
                arr[j++]=word1.charAt(i++);
            }
        }
        return new String(arr);
    }
}