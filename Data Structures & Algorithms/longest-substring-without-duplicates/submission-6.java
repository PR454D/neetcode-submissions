class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> chars = new HashSet<>();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
