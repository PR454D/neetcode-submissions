class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> chars = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (chars.contains(s.charAt(j))) break;
                chars.add(s.charAt(j));
            }
            res = Math.max(res, chars.size());
        }
        return res;
    }
}
