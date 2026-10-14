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

        ListNode dummy = new ListNode();
        ListNode temp2 = dummy;
        
        ListNode temp = head;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(temp != null){
            pq.add(temp.val);
            temp = temp.next;
        }

        while(!pq.isEmpty()){

            ListNode node = new ListNode();
            node.val = pq.poll();
            node.next = null;

            temp2.next = node;
            temp2 = temp2.next;
            
        }

        return dummy.next;
    }
}