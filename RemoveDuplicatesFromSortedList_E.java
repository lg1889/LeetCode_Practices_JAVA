/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * 
 * Tags: Linkedlist
 */


 public class Solution {
 	public static void main(String[] args) {

    }




    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
        	return head;
        }
        ListNode node = head;
        while (node.next != null) {
        	if (node.val == node.next.val) {
        		node.next = node.next.next;
        	} else {
        		node = node.next;
        	}
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}