package algorythms.easy.palindrome_llnked_list;

import java.util.ArrayList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ListNode currentNode = head;
        while (currentNode != null) {
            arrayList.add(currentNode.val);
            currentNode = currentNode.next;
        }


        int indexForward = 0;
        int indexBackward = arrayList.size() - 1;
        while (indexForward < indexBackward) {
            if (!arrayList.get(indexForward).equals(arrayList.get(indexBackward))) {
                return false;
            }
            indexForward++;
            indexBackward--;
        }
        return true;
    }
}
