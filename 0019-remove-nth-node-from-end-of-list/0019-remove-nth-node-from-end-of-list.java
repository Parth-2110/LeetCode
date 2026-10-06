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

        ListNode temp = head;
        int cnt = 0;

        if (head == null || head.next == null) {
            return null;
        }

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        int pos = 0;
        temp = head;

        while (temp != null) {
            pos++;
            int sum = cnt - n;

            if (sum == 0) {

                return head.next;
            }

            if (pos == sum) {
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;

        }

        return head;

    }
}