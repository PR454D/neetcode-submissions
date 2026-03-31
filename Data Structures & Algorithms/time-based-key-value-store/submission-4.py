class TimeMap:

    def __init__(self):
        self.key_value = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.key_value:
            self.key_value[key] = []
        self.key_value[key].append((timestamp, value))

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.key_value:
            return ""
        values = self.key_value[key]
        res = ""
        l, r = 0, len(values) - 1
        while l <= r:
            mid = (l + r) // 2
            if values[mid][0] <= timestamp:
                res = values[mid][1]
                l = mid + 1
            else:
                r = mid - 1
        return res