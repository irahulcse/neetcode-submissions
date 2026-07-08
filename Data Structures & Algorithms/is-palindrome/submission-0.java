class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        return stringBuilder.toString().contentEquals(stringBuilder.reverse());
    }
}
