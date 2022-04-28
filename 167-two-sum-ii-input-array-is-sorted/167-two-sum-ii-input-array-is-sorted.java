class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        //We have used left -> l and right -> r to denote the first pointer and second pointer respectively
        int l = 0;
        int r = numbers.length - 1;
        //
        int[] arrayNum = {l , r}; // or int[] arrayNum = new int[2];
        
        while (l < r) {
            int cursum = numbers[l] + numbers[r];
            
        //When the sum is equal to the target: -> We have found the answer and simply return the required indexes of the above used two pointers.    
            if (cursum == target) {
                arrayNum[0] = l + 1;
                arrayNum[1] = r + 1;
                return arrayNum;
            } else if (cursum > target) { 
        //When the sum is bigger than target: -> We'll move right pointer to the left by 1
                r--;
            } else if (cursum < target) {
        //When the sum is smaller than the target: -> We'll move left pointer to the right by 1        
                l++;
            }
        } return arrayNum;
    }
}