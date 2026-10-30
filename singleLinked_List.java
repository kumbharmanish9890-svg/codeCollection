class singleLinked_List
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

	public singleLinked_List()
	{
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	//Insertion

	public void insertionAtHead(int data)
	{

		Node newNode = new Node (data);


		if(head == null && tail==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	public void insertionAtTail(int data)
	{
		Node newNode = new Node(data);

		if(head == null && tail == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;

		}
		size++;

	}
	public void insertionAtPosition(int position,int data)
	{

		if(position<1 || position > size + 1)
		{
			System.out.println("Insertion is not posible at this Position");
			return;
		}
		if(position == 1)
		{
			insertionAtHead(data);
			return;
		}
		if(position==size+1)
		{
			insertionAtTail(data);
			return;
		}

		Node prevNode = head;

		for(int i=1;i<=position-2;i++)
		{
			prevNode = prevNode.next;
		}

		Node newNode = new Node(data);


		newNode.next = prevNode.next;
		prevNode.next = newNode;

		size ++;

	}

	public void PrintList()
	{
		Node temp = head;
	

		while(temp != null)
		{

			System.out.print(temp.data +  "->");
			temp = temp.next;
		}
		System.out.println();
	}
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return head == null;
	}
	public int getHead()
	{
		if(head == null)
		{
			return -1;
		}else{
			return head.data;
		}
	}
	public int getTail()
	{
		if(tail==null)
		{
			return -1;
		}else{
			return tail.data;
		}
	}


	public static void  main(String args[])
	{

		singleLinked_List l = new singleLinked_List();

		if(l.isEmpty())
		{
			System.out.println("List is empty");
		}

		System.out.println("List of size : " + l.getSize());
		 
		l.insertionAtHead(10);
		l.PrintList();

		l.insertionAtHead(20);
		l.PrintList();

		l.insertionAtHead(30);
		l.PrintList();

		l.insertionAtTail(100);
		l.PrintList();

		l.insertionAtTail(101);
		l.PrintList();

		l.insertionAtTail(102);
		l.PrintList();

		l.insertionAtHead(456);
		l.PrintList();

		l.insertionAtPosition(1, 88);
		l.PrintList();

		l.insertionAtPosition(9, 90);
		l.PrintList();

		l.insertionAtPosition(6, 500);
		l.PrintList();

	}
}