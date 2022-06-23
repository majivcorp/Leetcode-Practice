class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length -1;
        
        
        while (l <= h) {
            int mid = l + ( h - l ) / 2;
            int g = nums[mid];
            if (g == target) {
                return mid; 
            }
            
            if (g < target) {
                l = mid + 1;
            }
            else if (g > target) {
                h = mid - 1;
            }
        }
        
        return -1;
        
        
        
        
    }
}