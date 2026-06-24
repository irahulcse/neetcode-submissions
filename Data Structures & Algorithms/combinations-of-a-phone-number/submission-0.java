class Solution {
    private final String[] digitToChar = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
    };
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return res;
        backTrack(0, "", digits);
        return res;
    }

    private void backTrack(int i, String currentStr, String digits) {
        if (currentStr.length() == digits.length()) {
            res.add(currentStr);
            return;
        }
        String chars = digitToChar[digits.charAt(i) - '0'];
        for (char c : chars.toCharArray()) {
            backTrack(i + 1, currentStr + c, digits);
        }
    }
}
