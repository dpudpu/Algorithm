from typing import List


class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        res = []
        n = len(boxes)
        right_count, right, left_count, left = 0, 0, 0, 0

        for i in range(0, n):
            res.append(right)
            right_count += 1 if boxes[i] == '1' else 0
            right += right_count

        for i in range(n - 1, -1, -1):
            res[i] += left
            left_count += 1 if boxes[i] == '1' else 0
            left += left_count

        return res
