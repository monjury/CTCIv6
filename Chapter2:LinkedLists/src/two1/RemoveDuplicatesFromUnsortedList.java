package two1;

import java.util.HashSet;
import java.util.Set;

import common.ListNode;

// Remove duplicate from an unsorted Linked List.

// Temporary Buffer is not allowed.

// Hint #1 : Use hash table to solve in single pass

// Hint #2 : Without extra space. Time required is O(n^2). 

// 			 Use 2 pointers where second one searches ahead of first one.

public class RemoveDuplicatesFromUnsortedList {

	Set<Integer> vals = new HashSet<>();

	public ListNode removeDuplicate(ListNode head) {

		if (head == null) {
			return null;
		}
		ListNode last = head;
		ListNode curr = last.next;

		while (curr != null) {

			if(vals.contains(curr.val)) {
				last.next = curr.next;
			}
			else {
				vals.add(curr.val);
				last = curr;
			}
			curr = curr.next;
		}
		return head;
	}
}
