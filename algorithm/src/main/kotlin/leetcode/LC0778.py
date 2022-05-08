# TODO 다시 풀기
class Solution:
    def swimInWater(self, grid):
        n = len(grid)
        pq = [(grid[0][0], 0, 0)]
        visited = {(0, 0)}
        res = 0

        while True:
            T, x, y = heapq.heappop(pq)
            res = max(res, grid[x][y])
            if x == y == n - 1:
                return res
            for i, j in [(x + 1, y), (x, y + 1), (x - 1, y), (x, y - 1)]:
                if 0 <= i < n and 0 <= j < n and (i, j) not in visited:
                    visited.add((i, j))
                    heapq.heappush(pq, (grid[i][j], i, j))