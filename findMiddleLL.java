class findMiddleLL
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
	public ListNode midfind(ListNode head)
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
	public static void main(String args[])
	{

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		ListNode temp  = head;

		while(temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();

		findMiddleLL obj = new findMiddleLL();

		System.out.println("middle value " + obj.midfind(head).data);


	}
}