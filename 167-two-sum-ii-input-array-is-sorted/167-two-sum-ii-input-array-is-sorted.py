class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        #We have used left -> l and right -> r to denote the first pointer and second pointer respectively
        l = 0
        r = len(numbers) - 1
        while(l < r):
            #When the sum is equal to the target: -> We have found the answer and simply return the required indexes of the above used two pointers.
            if numbers[l] + numbers[r] == target:
                return [l+1, r+1]
            #When the sum is bigger than target: -> We'll move right pointer to the left by 1
            elif numbers[l] + numbers[r] > target:
                r = r - 1
            else:
                l = l + 1
        
        
