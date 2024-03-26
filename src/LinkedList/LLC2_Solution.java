// https://leetcode.com/problems/linked-list-cycle-ii/description/

package LinkedList;

import static LinkedList.LL.lengthCycle;

public class LLC2_Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start Node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward till they meet at the start of the cycle
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
}
