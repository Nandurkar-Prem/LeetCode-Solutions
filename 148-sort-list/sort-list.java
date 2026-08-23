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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 != null){
            tail.next = list1;
        }else{
            tail.next = list2;
        }
        return dummyHead.next;
    }

    // static ListNode getMid(ListNode head) {
    //     ListNode midPrev = null;
    //     while (head != null && head.next != null) {
    //         midPrev = (midPrev == null) ? head : midPrev.next;
    //         head = head.next.next;
    //     }
    //     ListNode mid = midPrev.next;
    //     midPrev.next = null;
    //     return mid;
    // }

    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
}