class reverse_LL_Recurrion
{

	static class ListNode
	{
		int data;
		ListNode  next;

		ListNode(int data)
		{
			this.data = data;
			this.next = next;
		}
	}
	public ListNode solve(ListNode prev,ListNode curr)
	{

		if(curr == null)
		{
			return prev;
		}

		ListNode forward = curr.next;
		curr.next = prev;

		prev = curr;
		curr = forward;

		return solve(prev,curr);

	}
	public ListNode ReverseLL(ListNode head)
	{

		ListNode prev = null;
		ListNode curr = head;
		ListNode ans = solve(prev,curr);
		return ans;
	}
	public static void main(String args[])
	{

	 	ListNode head = new ListNode(10);
	 	head.next = new ListNode(20);
	 	head.next.next = new ListNode(30);
	 	head.next.next.next = new ListNode(40);
	 	head.next.next.next.next = new ListNode(50);

	 	ListNode temp = head;

	 	while(temp != null)
	 	{
			System.out.print(temp.data + " - > ");
			temp = temp.next;
		}
		System.out.println();



		reverse_LL_Recurrion obj = new reverse_LL_Recurrion();

		head = obj.ReverseLL(head);

		ListNode t = head;

		while(t != null)
		{
			System.out.print(t.data + "->");
			t = t.next;
		}
		System.out.println("null");
	}
}