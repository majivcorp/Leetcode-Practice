class Solution {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a^b, (a&b) <<1);
    }
}

/* a if control statment iteration
class Solution {
    public int getSum(int a, int b) {
         if (b > 0) {
            while (b > 0) {
                a++;
                b--;
            }
        }
        if (b < 0) { // when 'b' is negative
            while (b < 0) {
                a--;
                b++;
            }
        }
        return a;
    }
}
*/



