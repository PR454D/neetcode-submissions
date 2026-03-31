class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) return List.of(List.of(strs[0]));
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> words = new HashMap<>();
        for (String word: strs) {
            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String unique = new String(characters);
            words.computeIfAbsent(unique, x -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(words.values());
    }
}
