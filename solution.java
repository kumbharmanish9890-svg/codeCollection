class solution
{
	static class ListNode
		{
			int data;
			ListNode next;

			ListNode(int data)
			{
				this.data = data;
				this.next = null;
			}
	}

	public  ListNode reverseList(ListNode head)
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
			head.next.next = new ListNode(3);
			head.next.next.next = new ListNode(4);
			head.next.next.next.next = new ListNode(5);

			ListNode temp = head;
			while(temp != null)
			{
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println();

			solution obj = new solution();

			head = obj.reverseList(head);

			ListNode t = head;
			while(t != null)
			{
				System.out.print(t.data + " ->");
				t = t.next;
			}
			System.out.println("null");


	}
}
