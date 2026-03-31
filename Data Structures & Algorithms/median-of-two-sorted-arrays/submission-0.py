class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        res = sorted(nums1 + nums2)
        
        n = len(res)
        if n % 2 == 0:
            mid1 = res[n // 2 - 1]
            mid2 = res[n // 2]
            return float((mid1 + mid2) / 2)
        else:
            return float(res[n // 2])