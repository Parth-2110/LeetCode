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
    public ListNode deleteMiddle(ListNode head) {

        ListNode temp = head;
        int len = 0;

        if(head == null ) return head;

        else if(head.next == null){
            head = null;
            return head;
        }

        

        while(temp != null){
            len++;
            temp = temp.next;
        }

        

         

        int mid = len/2;
        temp = head;

        ListNode prev = head;

        for(int i = 0; i < mid; i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

        return head;    



        
    }
}