package common;

public class ListNode {

	public int val;

	public ListNode next;

	public ListNode(int val) {

		this.val = val;
	}

	public ListNode(int[] input) {

		if (input == null || input.length == 0) {
			return;
		}

		ListNode current = this;
		for (int i = 0; i < input.length; i++) {
			ListNode c = new ListNode(input[i]);
			current.next = c;
			current = current.next;
		}
	}
}
