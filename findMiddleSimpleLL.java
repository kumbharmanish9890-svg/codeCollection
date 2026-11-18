class findMiddleSimpleLL
{
	static class LNode
	{
		int data;
		LNode next;

		LNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String args[])
	{


		LNode head = new LNode(1);
		head.next = new LNode(2);
		head.next.next = new LNode(3);

		LNode temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}

		System.out.println();

		findMiddleSimpleLL obj = new findMiddleSimpleLL();

	}

}