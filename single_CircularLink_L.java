class single_CircularLink_L
{
	static class Node
	{
		int data;
		Node next;


		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	private int size;


	single_CircularLink_L()
	{
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void insertAtHead(int data)
	{

		Node newNode = new Node(data);

		if(head == null)
		{
			head = newNode;
			tail  = newNode;
			tail.next = head;
		}else
		{

			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
		size ++;

	}
	public void insertAtTail(int data)
	{
		Node newNode = new Node(data);

		if(head == null && tail == null)
		{

			head = newNode;
			tail = newNode;
			newNode.next = head;

		}else{

			tail.next = newNode;
			tail = newNode;

			newNode.next = head;

		}

		size ++;
	}
	public void insertAtPos(int pos,int data)
	{
		if(pos < 1 || pos > size +1)
		{
			System.out.println("Invalid Postion !");
			return;
		}
		if(pos == 1)
		{
			insertAtHead(data);
			return;
	   	}
	   	if(pos == size+1)
	   	{
			insertAtTail(data);
			return;
		}
		Node newNode = new Node(data);
		Node prevNode =  head;
		for(int i =1 ;i <-1;i++)
		{
			prevNode = prevNode.next;
		}

		Node currNode = newNode;
		Node nextNode = prevNode.next;

		prevNode.next = currNode;
		currNode.next = nextNode;

		size ++;
	}

	public void show()
	{

		Node temp = head;
		do{

			System.out.print(temp.data + "->");
			temp = temp.next;
		}

		while(temp != head);
		System.out.println("(back to Head)");
	}

	public int search(int target)
	{

		Node temp = head;

		if(head == null)
		{
			System.out.println("Licked List is empty");
			return -1;
		}
		do
		{
			if(temp.data == target)
			{
				return 1;
			}else
			{
				temp = temp.next;
			}
		}
		while(temp != head);
		return -1;

	}
	public void delAtHead()
	{
		if(head == null)
		{
			System.out.println("list is empty");
			return;
		}
		if(head == tail)
		{
			head.next = null;
			head = null;
			tail = null;
			size = 0;
			return;
		}

		head = head.next;
		tail.next = head;
		size --;
	}
	public void delAtTail()
	{
		if(head == null)
		{
			System.out.println("Linked List is empty");
			return;
		}
		if(head == tail)
		{
			tail = null;
			head =null;
			size = 0;
		}
		Node temp = head;
		for(int i = 1;i<=size-2;i++)
		{
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		tail.next = head;

		size --;
	}
	public void delAtPos(int pos)
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		if(pos <1 || pos > size)
		{
			System.out.println("Invalid Position !");
			return;
		}
		if(pos == 1)
		{
			delAtHead();
			return;
		}
		if(pos == size)
		{
			delAtTail();
			return;
		}

		Node prevNode = head;
		for(int i = 1 ;i<=pos-2;i++)
		{
			prevNode = prevNode.next;
		}

		Node currNode = prevNode.next;
		Node nextNode = currNode.next;

		prevNode.next = nextNode;

		currNode.next = null;
		size --;


	}
	public static void main(String args[])
	{

		single_CircularLink_L list = new single_CircularLink_L();
		list.insertAtHead(34);
		list.show();
		list.insertAtHead(88);
		list.show();
		list.insertAtTail(200);
		list.show();
		list.insertAtTail(988);
		list.show();
		list.insertAtPos(5,99);
		list.show();
		list.insertAtPos(2,45);
		list.show();
		System.out.println(list.search(88));
		list.show();

		//list.delAtHead();
		//list.show();

		list.delAtTail();
		list.show();


		list.delAtPos(3);
		list.show();

		list.insertAtHead(34);
		list.show();
		list.insertAtHead(88);
		list.show();

		list.delAtPos(5);
		list.show();

	}
}