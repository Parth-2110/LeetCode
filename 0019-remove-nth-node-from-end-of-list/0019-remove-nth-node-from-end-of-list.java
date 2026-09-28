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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || head.next == null) return null;
        
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        temp = head;    
        int pos = 0;
        while(temp != null){
            pos++;
            int sum = cnt - n ;

            if(sum == 0){
                return head.next;
            }

            if(pos == sum){
                temp.next = temp.next.next;
                break;
            }


            temp = temp.next;
 
        }

return head;

    }
}
