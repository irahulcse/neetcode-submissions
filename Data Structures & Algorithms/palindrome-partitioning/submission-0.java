class Solution {
    private final List<List<String>> res = new ArrayList<>();
    private final List<String> path = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(0, s);
        return res;
    }

    private void dfs(int start, String s) {
        if (start == s.length()) {
            res.add(new ArrayList<>(path));
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                path.add(s.substring(start, end + 1));
                dfs(end + 1, s);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
