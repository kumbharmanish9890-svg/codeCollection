class circularDoublyLL
{
	static class Node
	{
		int data;
		Node next;
		Node prev;

		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}


	private  Node head;
	private Node tail;
	private  int size;

	circularDoublyLL()
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
			tail = newNode;
			tail.next = head;

		}else{

			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			tail.next = head;

		}
		size ++;
	}
	public void insertAtTail(int data)
	{
		Node newNode = new Node(data);

		if(head == null)
		{
			head = newNode;
			tail = newNode;
			tail.next = head;
		}else{

			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = head;
		}
		size ++;
	}

	public void insertAtPos(int pos,int data)
	{
		if(pos < 1 || pos > size+1)
		{
			System.out.println("Invaild Position");
			return;
		}
		if(pos == 1)
		{
			insertAtHead(data);
			return;
		}
		if(pos == size)
		{
			insertAtTail(data);
			return;
		}

		Node temp = head;
		for(int i = 1;i<pos-1;i++)
		{
			temp = temp.next;
		}

		Node newNode = new Node(data);
		Node nextNode = temp.next;

		newNode.prev = temp;
		temp.next = newNode;
		newNode.next = nextNode;
		nextNode.prev = newNode;

		size ++;
	}

	public void Print()
	{
		Node temp = head;
		do
		{
			System.out.print(temp.data  + "->");
			temp = temp.next;
		}
		while(temp != head);
		System.out.println("back to head");
	}
	public boolean Search(int target)
	{
		if(head == null)
		{
			System.out.println("List is empty can't find");
			return false;
		}
		Node temp = head;

		do
		{

			if(temp.data == target)
			{
				return true;
			}
			temp = temp.next;
		}
		while(temp != head);

		return false;
	}
	public void insertVal()
	{

	}

	public static void main(String args[])
	{

		circularDoublyLL list = new circularDoublyLL();

		list.insertAtHead(65);
		list.Print();

		list.insertAtTail(456);
		list.Print();


		list.insertAtHead(100);
		list.Print();

		list.insertAtTail(1000);
		list.Print();

		list.insertAtPos(3,55);
		list.Print();

		System.out.println(list.Search(100));



	}
}