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

/*
Given the head of a singly linked list, return true if it is a
palindrome or false otherwise.

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:

Input: head = [1,2]
Output: false

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */