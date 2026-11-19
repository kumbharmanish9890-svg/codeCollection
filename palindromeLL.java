class palindromeLL
{
	static class ListNode
	{
		int val;
		ListNode next;

		ListNode(int val)
		{
			this.val = val;
			this.next = null;
		}
	}
	public ListNode getMidPoint(ListNode head)
	{
		ListNode slow = head;
		ListNode fast = head;

		while(fast != null)
		{
			fast = fast.next;
			if(fast != null)
			{
				fast = fast.next;
				slow = slow.next;
			}
		}
		return slow;
	}

	public ListNode reverseLL(ListNode head)
	{
		ListNode prev = null;
		ListNode curr = head;

		while(curr != null)
		{
			ListNode forward = curr.next;
			curr.next = prev;

			prev = curr;
			curr = forward;
		}
		return prev;
	}
	public static void main(String args[])
	{
		palindromeLL head = new palindromeLL(1);
		head.next = new palindromeLL(2);
		head.next.next = new palindromeLL(6);
		head.next.next.next = new palindromeLL(2);
		head.next.next.next.next = new palindromeLL(1);

		ListNode temp = head;

		while(temp != null)
		{
			System.out.println(temp.val + "->");
			temp = temp.next;
		}
	}
}