class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        ops = ["+", "-", "*", "/"]

        res = []

        for tok in tokens:
            if tok in ops:
                b = int(res.pop())
                a = int(res.pop())

                val = 0
                if tok == "+":
                    val = a + b
                elif tok == "-":
                    val = a - b
                elif tok == "*":
                    val = a * b
                elif tok == "/":
                    val = int(a / b)
                res.append(val)
            else:
                res.append(tok)
            
        return int(res[0])