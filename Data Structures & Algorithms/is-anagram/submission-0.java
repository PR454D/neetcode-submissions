class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] charCounts = new int[26];
        // novel approach since input type size is fixed

        for (int i = 0; i < s.length(); ++i) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            charCounts[s1 - 'a']++;
            charCounts[t1 - 'a']--;
        }

        for (int count: charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
