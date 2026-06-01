class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operators = Set.of("+", "-", "*", "/");
        List<String> prev = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (operators.contains(tokens[i])) {
                int b = Integer.parseInt(prev.removeLast());
                int a = Integer.parseInt(prev.removeLast());

                int res = 0;
                String token = tokens[i];
                if (token.equals("+")) {
                    res = a + b;
                } else if (token.equals("-")) {
                    res = a - b;
                } else if (token.equals("*")) {
                    res = a * b;
                } else if (token.equals("/")) {
                    res = (int) a / b;
                }
                prev.add(String.valueOf(res));
            } else {
                prev.addLast(tokens[i]);
            }
        }
        return Integer.parseInt(prev.get(0));
    }
}
