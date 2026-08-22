/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                length = cycleLength(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        //Here we are finding the first Node of the cycle
        ListNode first = head;
        ListNode second = head;
        while(length > 0){
            second = second.next;
            length--;
        }

        //Now keep moving both pointers then they will meet at cycle start
        while(first != second){
            first = first.next;
            second = second.next;
        }
        return second;
    }

    static int cycleLength(ListNode head){
        if(head == null || head.next == null){
            return 0;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}