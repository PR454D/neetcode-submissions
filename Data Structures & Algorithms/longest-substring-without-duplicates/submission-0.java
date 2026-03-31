class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seenChars = new HashMap<>();
        int l = 0;
        int result = 0;
        for (int r = 0; r < s.length(); ++r) {
            if (seenChars.containsKey(s.charAt(r))) {
                l = Math.max(l, seenChars.get(s.charAt(r)) + 1);
            }
            seenChars.put(s.charAt(r), r);
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
