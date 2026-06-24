class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> seen = new HashSet<>();
        int count = 0;
        for (char c: allowed.toCharArray()) {
            seen.add(c);
        }
        System.out.println(seen);
        for (String word: words) {
            boolean cons = true;
            for (char c: word.toCharArray()) {
                if (!seen.contains(c)) {
                    cons = false;
                    break;
                }
            }

            if (cons) {
                count++;
            }
        }
        return count;
    }
}