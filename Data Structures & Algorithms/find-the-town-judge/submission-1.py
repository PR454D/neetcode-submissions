# check len(trust) is less than n.. i.e at least one person does not trust anybody.
# else return -1

# check if everyone trusts the same person found in step 1, remove from array if not.
# if len of array is 1, return the item, else -1.

class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        nobody = {x for x in range(1, n + 1)}

        for t in trust:
            if t[0] in nobody:
                nobody.remove(t[0])
        
        if len(nobody) != 1:
            return -1
        
        judge = nobody.pop()

        no_trust = {x for x in range(1, n + 1) if x != judge}
        for t in trust:
            if t[1] == judge:
                no_trust.remove(t[0])

        if no_trust:
            return -1
        else:
            return judge
