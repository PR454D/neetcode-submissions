# check len(trust) is less than n.. i.e at least one person does not trust anybody.
# else return -1

# check if everyone trusts the same person found in step 1, remove from array if not.
# if len of array is 1, return the item, else -1.

class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        incoming = defaultdict(int)
        outgoing = defaultdict(int)

        for src, dst in trust:
            outgoing[src] += 1
            incoming[dst] += 1
        
        for i in range(1, n + 1):
            if outgoing[i] == 0 and incoming[i] == n - 1:
                return i
        
        return -1