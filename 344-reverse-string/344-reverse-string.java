class Solution {
    public void reverseString(char[] s) {
        //1. We initialize two pointers, left and right, to point to the first and last characters of the string, respectively.
        int left = 0;
        int right = s.length - 1;
        
        //We swap the characters at the two pointers until left is less than right.
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            //3. We decrement right and increment left until they meet.
            left++;
            right--;
        }
    }
}