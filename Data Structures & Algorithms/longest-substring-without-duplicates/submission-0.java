class Solution {
     public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (hashSet.contains(s.charAt(right))) {
                hashSet.remove(s.charAt(left));
                left++;
            }

            hashSet.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;
    }
}
