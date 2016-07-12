package ua.drunya;

public class Leetcode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode current = null;
        boolean carried = false;
        while (l1 != null || l2 != null) {

            Integer v1 = l1 != null ? l1.val : 0;
            Integer v2 = l2 != null ? l2.val : 0;

            Integer sum = carried ? 1 + v1 + v2 : v1 + v2;

            if (carried) {
                current.val = sum % 10;
            } else {
                ListNode newNode = new ListNode(sum % 10);
                if (current != null) {
                    current.next = newNode;
                    current = newNode;
                } else {
                    current = newNode;
                    head = current;
                }
            }

            carried = sum > 9;

            if (carried) {
                current.next = new ListNode(1);
                current = current.next;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

        }

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return val + (next != null ? " -> " + next : "");
        }
    }
}
