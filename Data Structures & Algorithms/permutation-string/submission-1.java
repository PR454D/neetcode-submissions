class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) {
            return false;
        }
        int[] target = freq(s1);

        for (int i = 0; i < (n2 - n1 + 1); i++) {
            if (Arrays.equals(freq(s2.substring(i, i + n1)), target))
                return true;
        }
        return false;
    }

    private int[] freq(String s) {
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }
}
