class Solution {
    public void reverseString(char[] s) {
        //1. We start with the base case. If the length of the string is less than or equal to 1, we return.
        if (s == null || s.length <= 1) {
            return;
        }
        //2. We swap the first and last characters.
        reverse(s, 0, s.length-1);  
        
    }
    //3. We call the function recursively with the start index incremented by 1 and the end index decremented by 1.
    public void reverse(char[] str, int start, int end) {
        if (start >= end) {
            return;
        }
        char ch = str[start];
        str[start] = str[end];
        str[end] = ch;
        reverse(str, start +1, end-1);
    }
}