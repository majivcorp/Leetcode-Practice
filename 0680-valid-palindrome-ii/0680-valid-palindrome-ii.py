class Solution:
    # This Python class, Solution, has two methods check_palindrome and valid_palindrome,
    
    def checkPalindrome(self, s, l, r) -> bool:
        # This method uses a while loop to check if the characters at the l and r positions are the same.
        while l < r:
            # If they are not, it returns false.
            if s[l] != s[r]:
                return False
            # Otherwise, it increments l and decrements r until l is greater than or equal to r.
            l += 1
            r -= 1
            # If the loop completes without finding a mismatch, it returns true.
        return True

    def validPalindrome(self, s):
        # Initialize one pointer at the start of the string and one at the end.
        l, r = 0, len(s) - 1
        # while loop to check if the characters at the l and r positions are the same.
        while l < r:
            if s[l] != s[r]:
                return (self.checkPalindrome(s, l, r - 1) or self.checkPalindrome(s, l + 1, r))
            # Otherwise, it increments l and decrements r until l is greater than or equal to r.
            l += 1
            r -= 1
        #If the loop completes without finding a mismatch, it returns true.    
        return True

        