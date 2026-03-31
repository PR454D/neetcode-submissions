class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length <= 1) return List.of(List.of(strs[0]));
        Map<String, List<String>> res = new HashMap<>();
        for (String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
