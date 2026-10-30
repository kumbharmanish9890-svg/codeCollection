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
			newNode.next = tail;
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


	public static void  main(String args[])
	{

		singleLinked_List l = new singleLinked_List();
		l.insertionAtHead(10);
		l.PrintList();

		l.insertionAtHead(20);
		l.PrintList();

		l.insertionAtHead(30);
		l.PrintList();

	}
}