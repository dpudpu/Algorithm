import heapq
from collections import Counter


class Solution:
    def frequencySort(self, s: str) -> str:
        numsByCount = Counter(s)
        pq = []
        for i in numsByCount:
            heapq.heappush(pq, (-numsByCount[i], i))

        res = ""
        while pq:
            w = heapq.heappop(pq)
            res += -1 * w[0] * w[1]

        return res
