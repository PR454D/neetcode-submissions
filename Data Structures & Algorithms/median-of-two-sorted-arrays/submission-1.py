class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        A, B = nums1, nums2
        total = len(nums1) + len(nums2)
        half = total // 2
        if len(B) < len(A):
            A, B = B, A # swap to make sure len of A is small
        
        l, r = 0, len(A) - 1
        while True:
            a_mid = (l + r) // 2 if l <= r else -1 # A mid
            b_mid = half - a_mid - 2 # B mid

            Aleft = A[a_mid] if a_mid >= 0 else float("-infinity")
            Aright = A[a_mid + 1] if (a_mid + 1) < len(A) else float("infinity")
            Bleft = B[b_mid] if b_mid >= 0 else float("-infinity")
            Bright = B[b_mid + 1] if (b_mid + 1) < len(B) else float("infinity")
            
            # partitions correct now
            if Aleft <= Bright and Bleft <= Aright:
                if total % 2:
                    return min(Aright, Bright)
                return (max(Aleft, Bleft) + min(Aright, Bright)) / 2
            elif Aleft > Bright:
                r = a_mid - 1
            else:
                l = a_mid + 1