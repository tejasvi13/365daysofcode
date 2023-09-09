//Question:https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        Set<Character> ch= new HashSet<>();
        int l= 0;        
        for (int i= 0;i< n;i++) {
            if (!ch.contains(s.charAt(i))) {
                ch.add(s.charAt(i));
                max= Math.max(max,i- l+ 1);
            } else {
                while (ch.contains(s.charAt(i))) {
                    ch.remove(s.charAt(l));
                    l++;
                }
                ch.add(s.charAt(i));
            }
        }        
        return max;
    }
}