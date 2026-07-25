class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // if (s1.length() > s2.length()) {
        //     return false;
        // }
        // int[] string1Count = new int[26];
        // int[] windowCount = new int[26];

        // for (int i = 0; i < s1.length(); i++) {
        //     string1Count[s1.charAt(i) - 'a']++;
        //     windowCount[s2.charAt(i) - 'a']++;
        // }
        // if (Arrays.equals(string1Count, windowCount)) {
        //     return true;
        // }
        // for (int right = s1.length(); right < s2.length(); right++) {
        //     windowCount[s2.charAt(right) - 'a']++;
        //     windowCount[s2.charAt(right - s1.length()) - 'a']--;

        //     if (Arrays.equals(string1Count, windowCount)) {
        //         return true;
        //     }
        // }
        // return false;

        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);


        for (int i = 0; i < s2.length(); i++) {
            for (int j = i; j < s2.length(); j++) {
                char[] s2Arr = s2.substring(i, j + 1).toCharArray();
                Arrays.sort(s2Arr);
                String sortedS2 = new String(s2Arr);
                if (sortedS1.equals(sortedS2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
