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

		while(temp != null)
		{
			System.out.print(temp.data + "->");
		//	temp= temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{

		CircularLink_L list = new CircularLink_L();
		list.insertAtHead(34);
		list.show();

	}
}