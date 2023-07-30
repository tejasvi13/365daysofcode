//Question:https://leetcode.com/problems/maximum-number-of-achievable-transfer-requests/description/
class Solution {
    public int maximumRequests(int n, int[][] requests) {
        int[] change = new int[n];
        return dfs(0, 0, n, requests, change);
    }

    private int dfs(int pos, int count, int n, int[][] requests, int[] change) {
        if (pos == requests.length) {
            return checkValid(change) ? count : 0;
        }

        int[] req = requests[pos];
        int result = dfs(pos + 1, count, n, requests, change);
        change[req[0]]--;
        change[req[1]]++;
        result = Math.max(result, dfs(pos + 1, count + 1, n, requests, change));
        change[req[0]]++;
        change[req[1]]--;
        return result;
    }
    private boolean checkValid(int[] change) {
        for (int changes : change) {
            if (changes != 0) {
                return false;
            }
        }
        return true;
    }
}