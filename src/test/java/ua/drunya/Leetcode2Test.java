package ua.drunya;

import org.junit.Test;
import ua.drunya.Leetcode2.ListNode;

import static org.junit.Assert.assertEquals;

public class Leetcode2Test {

    @Test
    public void test1() throws Exception {
        ListNode listNode1 = new Leetcode2().addTwoNumbers(toList(342), toList(465));
        assertEquals("7 -> 0 -> 8", listNode1.toString());
    }

    private ListNode toList(int i) {

        char[] charArray = String.valueOf(i).toCharArray();
        ListNode next = null;
        for (char c : charArray) {
            ListNode listNode = new ListNode(Integer.parseInt(Character.toString(c)));
            listNode.next = next;
            next = listNode;
        }
        return next;
    }
}