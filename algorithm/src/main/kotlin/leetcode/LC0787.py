import collections
import heapq
from typing import List


class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        graph = collections.defaultdict(list)
        visited = collections.defaultdict(dict)
        for (f, to, cost) in flights:
            graph[f].append((to, cost))
            visited[f][to] = False

        pq = [(0, src, 0)]
        cheapest_prices = [float('inf') for i in range(n)]
        cheapest_prices[src] = 0
        while pq:
            price, index, stop = heapq.heappop(pq)
            if index == dst:
                return price
            if stop <= k:
                for (to, cost) in graph[index]:
                    if cheapest_prices[to] < price + cost or not visited[index][to]:
                        visited[index][to] = True
                        cheapest_prices[to] = price + cost
                        heapq.heappush(pq, (cheapest_prices[to], to, stop + 1))

        return -1


if __name__ == '__main__':
    l =[[0,1,5],[1,2,5],[0,3,2],[3,1,2],[1,4,1],[4,2,1]]
    print(Solution().findCheapestPrice(5, l, 0, 2, 2))
