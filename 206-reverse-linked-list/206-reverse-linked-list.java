/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //1. We initialize three pointers a, b, and c.
        
        ListNode a = null; //2. a is initialized to null,
        
        ListNode b = null; //b is initialized to null,
        
        ListNode c = head; //and c is initialized to head.
        
        //3. We loop through the list while c is not null.
        while (c!=null) {
            a = b;      //4. a is assigned to b,
            
            b = c;      // b is assigned to c,
            
            c = c.next; //and c is assigned to c.next.
            
            b.next = a; //5. b.next is assigned to a.
        }
        return b; //6. We return b after the loop terminates.



    }
}