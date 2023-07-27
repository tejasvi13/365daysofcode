class Solution {
    public String sortVowels(String s) {
        String vowels = "AEIOUaeiou";
        int[] cnt = new int[10];
        int pos;
        for(int i=0;i<s.length();++i){
            pos = vowels.indexOf(s.charAt(i));
            if(pos!=-1){
                ++cnt[pos];
            }
        }
        StringBuilder sb = new StringBuilder(s);
        int index = 0;
        for(int i=0;i<s.length();++i){
            if(vowels.contains(s.charAt(i)+"")){
                while(cnt[index]==0){
                    ++index;
                }
                sb.setCharAt(i,vowels.charAt(index));
                --cnt[index];
            }
        }
        return sb.toString();
    }
}