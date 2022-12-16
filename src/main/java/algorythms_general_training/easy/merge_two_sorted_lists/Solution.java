package algorythms_general_training.easy.merge_two_sorted_lists;

import org.w3c.dom.Node;

public class Solution {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         /* a dummy first node to
           hang the result on */
        ListNode dummyNode = new ListNode(0);

        /* tail points to the
        last result node */
        ListNode tail = dummyNode;
        while (true) {

            /* if either list runs out,
            use the other list */
            if (list1 == null) {
                tail.next = list2;
                break;
            }
            if (list2 == null) {
                tail.next = list1;
                break;
            }

            /* Compare the data of the two
            lists whichever lists' data is
            smaller, append it into tail and
            advance the head to the next Node
            */
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }
}
