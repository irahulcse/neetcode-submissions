class Solution {
     public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> countFirst = new HashMap<>();
        HashMap<Character, Integer> countSecond = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            countFirst.put(s.charAt(i), countFirst.getOrDefault(s.charAt(i), 0) + 1);
            countSecond.put(t.charAt(i), countSecond.getOrDefault(t.charAt(i), 0) + 1);
        }

        return countFirst.equals(countSecond);
    }
}
