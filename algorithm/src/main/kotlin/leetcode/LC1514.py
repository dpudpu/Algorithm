import collections
import heapq
from typing import List

# Dijkstra
# Time: O((n + E) * logE), space: O(n + E), where E = edges.length.
class Solution:
    def maxProbability(self, n: int, edges: List[List[int]], succProb: List[float], start: int, end: int) -> float:
        # 0 으로 초기화한다.
        # 무방향 그래프를 만든다
        # start 부터 시작한다
        succ_probs = [0 for i in range(n)]
        graph = collections.defaultdict(list)
        for i, (source, target) in enumerate(edges):
            graph[source].append((target, i))
            graph[target].append((source, i))

        pq = [(1, start)]
        while pq:
            cur_prob, i = heapq.heappop(pq)
            if i == end:
                return -cur_prob

            if succ_probs[i] == 0:
                succ_probs[i] = abs(cur_prob)
                for adj_i, succ_prob_i in graph[i]:
                    heapq.heappush(pq, (-succ_probs[i] * succProb[succ_prob_i], adj_i))
        return 0.0
