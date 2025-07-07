class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26]; // Frequency of chars in s1
        int[] count2 = new int[26]; // Frequency of chars in current window of s2

        for (char ch : s1.toCharArray()) {
            count1[ch - 'a']++;
        }

        int window = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            count2[s2.charAt(i) - 'a']++;

            // Shrink the window from the left
            if (i >= window) {
                count2[s2.charAt(i - window) - 'a']--;
            }

            // Compare arrays
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}
