class Solution:
    def checkPalindrome(self, s, l, r) -> bool:
        while l < r:
            if s[l] != s[r]:
                return False
            l += 1
            r -= 1
        return True

    def validPalindrome(self, s):
        l, r = 0, len(s) - 1
        
        while l < r:
            if s[l] != s[r]:
                return (self.checkPalindrome(s, l, r - 1) or self.checkPalindrome(s, l + 1, r))
            l += 1
            r -= 1
            
        return True

        