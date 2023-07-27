class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int n = s.length();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (chars.indexOf(c) == -1) {
                a[i] = (int)c -96;
            }
            else {
                int j= chars.indexOf(c);
                a[i] = vals[j];
            }
        }
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            
        }
        return max;
    }
}