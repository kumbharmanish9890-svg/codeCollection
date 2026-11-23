class MergeTowLists
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

	public ListNode mergeTowLists(ListNode list1 , ListNode list2)
	{

		ListNode dummy = new ListNode(-1);
		ListNode ansHead = dummy;
		ListNode ansTail = dummy;



		while(list1 != null && list2 != null)
		{

			if(list1.val < list2.val)
			{
				ansTail.next = list1;
				list1 = list1.next;
				ansTail = ansTail.next;
			}
			else
			{
				ansTail.next = list2;
				list2 = list2.next;
				ansTail = ansTail.next;
			}

		}

		if(list1 != null)
		{
			ansTail.next = list1;
		}
		if(list2 != null)
		{
			ansTail.next = list2;
		}

		ansHead = ansHead.next;
		dummy.next = null;
		return ansHead;
	}


	public static void main(String args[])
	{

		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(5);


		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(4);
		list2.next.next = new ListNode(6);
		list2.next.next.next = new ListNode(8);


		MergeTowLists obj = new MergeTowLists();

		ListNode newNode = obj.mergeTowLists(list1,list2);

		ListNode temp  = newNode;

		while(temp != null)
		{
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
	}
}