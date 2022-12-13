package algorythms_general_training.easy.merge_two_sorted_lists;

public class Solution {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        int count = 0;
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (list1.val == list2.val) {
            result.val = list1.val;
        }
        if (list1.val < list2.val && count == 0) {
            result.val = list1.val;
            count++;
        }
        if (list1.val < list2.val && count == 1) {
            result.val = list2.val;
            count = 0;
        }
        if (list1.val > list2.val && count == 0) {
            result.val = list2.val;
            count++;
        }
        if (list1.val > list2.val && count == 1) {
            result.val = list2.val;
            count = 0;
        }
        return result;
    }
}
