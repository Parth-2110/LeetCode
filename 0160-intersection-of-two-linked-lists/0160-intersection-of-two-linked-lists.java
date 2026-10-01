/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA, tempB = headB;

        while(tempA != null){

                if(tempB == null){
                    tempB = headB;
                    tempA = tempA.next;
                }
            if(tempA == tempB){

                return tempA;
            }

            tempB = tempB.next;

        
        }

        return tempA;
        
    }
}