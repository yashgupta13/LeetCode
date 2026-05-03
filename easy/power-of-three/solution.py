import math
# class Solution:
#     def isPowerOfThree(self, n: int) -> bool:
#         if(n<=0):
#             return False
#         ans=math.log(n,3)
#         return not {ans % 1 != 0}

class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        return n > 0 and 1162261467 % n == 0