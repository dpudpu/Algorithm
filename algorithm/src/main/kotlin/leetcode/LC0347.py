import heapq
from collections import Counter
from typing import List


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numsByCount = Counter(nums)
        pq = []
        for i in numsByCount:
            heapq.heappush(pq, (-numsByCount[i], i))

        res = []
        for i in range(k):
            w = heapq.heappop(pq)
            res.append(w[1])
        return res

