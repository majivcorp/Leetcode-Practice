class Solution {
    public boolean isPalindrome(String s) {
        //1. We start with two pointers, one at the beginning and one at the end of the string.
        int l = 0;
        int r = s.length() - 1;
        //2. We loop until the two pointers meet.
        while(l < r){
            //3. We skip all non-letter or non-digit characters.
            while(l < s.length() - 1 && !Character.isLetterOrDigit((s.charAt(l)))){
                l++;
            }
            while(r > 0 && !Character.isLetterOrDigit((s.charAt(r)))){
                r--;
            }
            if(l > r){
                break;
            }

            char t1 = Character.toLowerCase(s.charAt(l));
            char t2 = Character.toLowerCase(s.charAt(r));
            //4. If the two characters pointed to by the two pointers are not equal, then we return false.
            if(t1 != t2){
                return false;
            }
            l++;
            r--;
        }
        //5. If we have reached the middle of the string, we return true.
        return true;
    }
    
}

/**
We created two pointers, one on the left side and one in the right side.
If the pointer is pointing a non alphabet character, skip it, otherwise compare does the character same.
Since the skipping process is inside the outer while loop, we need a check statement

if(l > r){
	break;
}
to prevent pointer cross each other after skipping.
**/







