class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        // sort, compare, and then result
        Map<String, List<String>> ansMap = new HashMap<>();
        int[] count = new int[26];
        for (String each: strs) {
            Arrays.fill(count, 0);
            for (char c: each.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; ++i) {
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ansMap.containsKey(key)) {
                ansMap.put(key,new ArrayList<>());
            }
            ansMap.get(key).add(each);
        }
        return new ArrayList<>(ansMap.values());
    }
}