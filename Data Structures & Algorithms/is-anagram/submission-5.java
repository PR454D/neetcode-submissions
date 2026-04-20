class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            countS.put(sChar[i], countS.getOrDefault(sChar[i], 0) + 1);
            countT.put(tChar[i], countT.getOrDefault(tChar[i], 0) + 1);
        }
        return countS.equals(countT);
    }
}
