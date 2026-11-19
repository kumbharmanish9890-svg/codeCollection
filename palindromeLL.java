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
	public boolean isPalindrome(ListNode head)
	{


		ListNode list2 = getMidPoint(head);

		ListNode temp = head;

		while(temp.next != list2)
		{
			temp = temp.next;
		}
		temp.next = null;

		ListNode head2 = reverseLL(list2);

		ListNode temp1 = head;
		ListNode temp2 = head2;

		while(temp1 != null && temp2 != null)
		{
			if(temp1.val != temp2.val)
			{

				return false;
			}else{

				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
		return true;
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
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(6);
		head.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next = new ListNode(1);

		ListNode temp = head;

		while(temp != null)
		{
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println();


		palindromeLL obj = new palindromeLL();

		System.out.println("List is Palindrome = " + obj.isPalindrome(head));
	}
}