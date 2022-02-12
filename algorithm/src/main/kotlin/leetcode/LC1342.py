class Solution:
    def numberOfSteps (self, num: int) -> int:
        steps = num == 0
        while num > 0:
            steps += 1 + (num & 1)
            num >>= 1
        return steps - 1
