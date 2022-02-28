class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max1 = 0
        max2 = 0

        for n in nums:
            if max1 < n:
                max2 = max1
                max1 = n
            elif max2 < n:
                max2 = n

        return (max1-1) * (max2-1)
