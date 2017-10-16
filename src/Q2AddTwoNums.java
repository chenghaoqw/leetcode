/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 *  https://leetcode.com/problems/add-two-numbers/description/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int cur = 0;
        int nowResult = 0;
        int l1Result = 0;
        int l2Result = 0;
        ListNode nowNode = result;
        while (l1 != null || l2 != null) {
            if (nowNode.next == null) {
                nowNode.next = new ListNode(0);
            }
            nowNode = nowNode.next;
            if (l1 == null) {
                l1Result = 0;
            } else {
                l1Result = l1.val;
            }
            if (l2 == null) {
                l2Result = 0;
            } else {
                l2Result = l2.val;
            }
            nowResult = l1Result + cur + l2Result;
            cur = 0;
            if (nowResult >= 10) {
                nowResult -= 10;
                cur = 1;
            }
            nowNode.val = nowResult;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (cur > 0) {
            nowNode.next = new ListNode(cur);
        }
        return result.next;
    }
}
