class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    // class Solution:
    // def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
    //     res = 0
    //     charSet = set()
    //     for c in allowed:
    //         charSet.add(c)
    //     print(charSet)
    //     for word in words:
    //         cons = True
    //         for char in word:
    //             if char not in charSet:
    //                 cons = False
    //                 break
            
    //         if cons:
    //             res+=1
        
    //     return res
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