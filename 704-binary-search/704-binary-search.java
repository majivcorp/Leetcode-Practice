class Solution {
    public int search(int[] nums, int target) {
        //1. We first initialize the left and right indices to 0 and nums.length - 1 respectively.

        int l = 0;
        int h = nums.length -1;
        
        
        while (l <= h) {
            int mid = l + ( h - l ) / 2; //2. Then we initialize the mid index to the left index plus the right index minus the left index.
            int g = nums[mid];
            if (g == target) {
                //3. We then check if the element at the mid index is equal to the target. If it is, then we return the mid index.
                return mid; 
            }
            
            if (g < target) {
                //4. If the element at the mid index is less than the target, then we update the left index to be the mid index plus one.
                l = mid + 1;
            }
            else if (g > target) {
                //5. If the element at the mid index is greater than the target, then we update the right index to be the mid index minus one.
                h = mid - 1;
            }
            //6. We then check if the left index is greater than or equal to the right index. If it is, then we return -1.
            //7. If the left index is less than the right index, then we repeat the while loop.
        }
        
        return -1;
        
        
        
        
    }
}