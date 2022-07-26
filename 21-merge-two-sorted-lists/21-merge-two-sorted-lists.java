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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
        //1. Create a new ListNode object and assign it to the SortedNode merged.
        ListNode testCase = new ListNode();
        ListNode merged = testCase;
        
        //2. Create a while loop that runs as long as list1 and list2 are not null.
        while (list1 != null && list2 != null) {
             if (list1.val < list2.val) {
                 merged.next = list1;
                 list1=list1.next;
             }else {
                 merged.next=list2;
                 list2 = list2.next;
                 
             } 
            merged = merged.next;//3. Increment SortedNode to point to the next node.
        }
        //4. Check if list1 is null. If not, assign the next value of list1 to merged.next.
        while (list1!=null) {
            merged.next = list1;
            list1 = list1.next;
            merged = merged.next;
        }
        //5. Check if list2 is null. If not, assign the next value of list2 to merged.next.
        while (list2!=null) {
            merged.next = list2;
            list2 = list2.next;
            merged = merged.next;
        }
    return testCase.next;//7. Return the SortedNode.next.
    }
}
