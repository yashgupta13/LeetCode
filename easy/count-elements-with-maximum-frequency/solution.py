class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        frequency={}
        for num in nums:
            if num in frequency:
                frequency[num]+=1
            else:
                frequency[num]=1

        max_fre=max(frequency.values())

        sum=0
        for num in frequency.values():
            if num==max_fre:
                sum=sum+max_fre
        
        return sum



        

        