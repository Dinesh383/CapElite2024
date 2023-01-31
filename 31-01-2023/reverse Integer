class Solution:
    def reverse(self, x: int):
        a = abs(x)
        res = 0
        while a > 0:
            res = res * 10 + a % 10
            a = a // 10
        if x < 0:
            res = res * -1
        if res > (2 ** 31) - 1 or res < -2 ** 31:
            return 0
        return res
