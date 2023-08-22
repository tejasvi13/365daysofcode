//Question:https://leetcode.com/problems/excel-sheet-column-title/description/
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            sb.append((char)((columnNumber)%26+'A'));
            columnNumber=columnNumber/26;
        }
        String s=sb.reverse().toString();
        return s;
    }
}