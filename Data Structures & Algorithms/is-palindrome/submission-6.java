class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        List<Integer> arr = s.codePoints()
            .filter(Character::isLetterOrDigit)
            .map(Character::toLowerCase)
            .boxed()
            .toList();
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            if (!arr.get(l).equals(arr.get(r))) return false;
            l++;
            r--;
        }
        return true;
    }
}
