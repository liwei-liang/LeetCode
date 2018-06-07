package day2;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	  public ListNode reverseList(ListNode head) {
		    ListNode prev = null;
		    ListNode curr = head;
		    while (curr != null) {
		        ListNode nextTemp = curr.next;
		        curr.next = prev;
		        prev = curr;
		        curr = nextTemp;
		    }
		    return prev;
		}
}
