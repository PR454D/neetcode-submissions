class Solution {
    public boolean isValid(String s) {
        Stack<Character> seen = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '{')
                seen.push('}');
            else if (c == '(')
                seen.push(')');
            else if (c == '[')
                seen.push(']');
            else if (seen.isEmpty() || seen.pop() != c)
                return false;
        }
        return seen.isEmpty();
    }
}
