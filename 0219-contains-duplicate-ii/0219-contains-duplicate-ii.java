class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //The method containsNearbyDuplicate takes two parameters: an integer array nums and an integer k.
        
            
        //A HashSet window is initialized to store the unique elements within the sliding window of size k + 1.
        Set<Integer> window = new HashSet<Integer>();
        
        //A for loop is used to iterate through the input array nums.
        for (int i = 0; i < nums.length; i++) {
            //Inside the loop, we first check if the HashSet window contains the current element nums[i]. 
            if (window.contains(nums[i])) {
                //If it does, that means we've found a duplicate element within the range of k indices, so we return true.
                return true;
            }//If the current element is not in the HashSet window, we add it to the set. 
            //This step helps maintain the sliding window of unique elements.
            window.add(nums[i]);
            //To keep the sliding window size within k + 1, we remove the oldest element from the window when its size becomes greater than k. 
            if (window.size() > k) {
                //We do this by calling window.remove(nums[i - k]).
                window.remove(nums[i - k]);
            }
                
        
        }//If the loop completes and no duplicates are found within the sliding window, the method returns false.
        return false;
    } 
}
    
    /*
    The main idea behind the sliding window algorithm is to maintain a window of size k + 1 as we iterate through the array. 
    This window helps us efficiently check for duplicates within the specified range. 
    The HashSet window ensures constant-time lookup, 
    addition, and removal operations, which contributes to the algorithm's efficiency.
    */
    