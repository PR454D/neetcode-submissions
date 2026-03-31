class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operators = ["+", "-", "*", "/"]
        prev = []
        for i in tokens:
            if i in operators:
                b = int(prev.pop())
                a = int(prev.pop())
                res = 0
                if i == "+":
                    res = a + b
                elif i == "-":
                    res = a - b
                elif i == "*":
                    res = a * b
                elif i == "/":
                    res = int(a / b)
                prev.append(res)
            else:
                prev.append(i)
        return int(prev[0])