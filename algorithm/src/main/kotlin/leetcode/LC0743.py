import collections
import heapq
from typing import List


class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        nodes = collections.defaultdict(list)
        shortest_times = collections.defaultdict(list)
        for (u, v, w) in times:
            nodes[u].append((v, w))

        pq = [(0, k)]
        while pq:
            w, v = heapq.heappop(pq)
            if v not in shortest_times:
                shortest_times[v] = w
                for (v2, w2) in nodes[v]:
                    heapq.heappush(pq, (w + w2, v2))

        return max(shortest_times.values()) if len(shortest_times) == n else -1
