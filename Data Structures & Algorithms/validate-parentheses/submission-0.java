class Solution {
    public boolean isValid(String s) {
        Stack<Character> parens = new Stack<>();
        Map<Character, Character> parensMap = new HashMap<>();
        parensMap.put('}', '{');
        parensMap.put(')', '(');
        parensMap.put(']', '[');

        for (char c: s.toCharArray()) {
            if (parensMap.containsKey(c)) {
                if (!parens.isEmpty() && parens.peek() == parensMap.get(c)) {
                    parens.pop();
                } else { return false; }
            } else {
                parens.push(c);
            }
        }
        return parens.isEmpty();
    }
}