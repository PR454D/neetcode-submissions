class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> seen = new HashMap<>();
        int left = 0;
        int max_f = 0;
        int max_len = 0;
        for (int right = 0; right < s.length(); right++) {
            seen.put(s.charAt(right), seen.getOrDefault(s.charAt(right), 0) + 1);
            max_f = Math.max(max_f, seen.get(s.charAt(right)));

            if ((right - left + 1) - max_f > k) {
                seen.put(s.charAt(left), seen.get(s.charAt(left)) - 1);
                left++;
            }

            max_len = Math.max(max_len, right - left + 1);
        }
        return max_len;
    }
}
