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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        
        ListNode temp = head;
        ListNode temp2 = head.next;
        ListNode prev = head.next;
        List<Integer> list = new ArrayList<>();
       

        while(temp != null && temp2 != null){
           

            temp = temp.next.next;
            list.add(temp2.val);
            if(temp != null){
            prev.val = temp.val;
            temp2 = temp.next;
            prev = prev.next;
            }

            
            
            
        }

        int pos = 0;


        while(prev != null){
            prev.val = list.get(pos);
            prev = prev.next;
            pos++;
            
        }
        return head;
    }
}