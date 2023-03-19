class Solution {
    public int[] replaceElements(int[] arr) {
       
        int rMax = -1;  // Initialize the variable int `rMax` to store the last element `-1`.
        
        int n = arr.length; //Get the length of the input array `arr` and store it in variable `n`.
        
        
        //Start from the right side of the array, and //iterate from the last element,at the end, n - 1 (arr.length - 1) to the first element 0 of the array
        for (int i = n - 1; i >= 0; i-- ) {
            
            // Update the `maximum element` we've seen so far to variable integer `newMax`.
            int newMax = Math.max(rMax, arr[i]); // from the current element( arr[i] ) and the last element (rMax) parameters
            
            
            arr[i] = rMax; //Replace the current element `arr[i]` with the maximum  element `(rMax)` we've seen so far.
            
            rMax = newMax; //Update the maximum element we’ve seen so far.
            
        }
        
        return arr;
    }
}