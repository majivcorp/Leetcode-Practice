class Solution {
    public int[] getConcatenation(int[] nums) {
        
        //Get the length of the input array `nums` and store it in variable `n`.
        int n = nums.length;
        //Create a new array `ans` of size 2 * n.
        int[] ans = new int[2 * n];
        
        //Iterate through the input array `nums` using a for loop with loop variable `i`.
        for (int i = 0; i < n; i++) {
            
            //Inside the loop, assign the value `nums[i]` to `ans[i]` and `ans[i + n]`.
            ans[i] = nums[i]; //Copy the first n elements of nums into the first n elements of ans.
            ans[i + n] = nums[i]; // Copy the first n elements of nums into the last n elements of ans.
        }
        //Return the `ans` array after completing the loop.
        return ans;
        
    }
}

//This implementation has a time complexity of O(n) and a space complexity of O(n), where n is the length of the input array `nums`.