class Node
{
	int data;
	Node next;
	Node prev;

	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
class CircularD_H_L
{

	private  Node header;

	public CircularD_H_L()
	{
		header = new Node(-1);
		header.next = header;
		header.prev = header;

	}

	public void insertBegin(int data)
	{
		Node frist = header.next;
		Node newNode = new Node(data);


		newNode.next = frist;
		newNode.prev = header;

		header.next = newNode;
		frist.prev = newNode;
	}

	public void insertEnd(int data)
	{
		Node last = header.prev;
		Node newNode = new Node(data);

		newNode.next = newNode;
		header.prev = newNode;
	}
	public void delete(int key)
	{

		if(header.next==header)
		{
			System.out.println("Last is empty. can not delete "+ key);
			return;
		}

		Node cur = header.next;
		while(cur != header && cur.data != key)
		{
			cur = cur.next;

		}
		if(cur == header)
		{

			System.out.println("Element "+key+" not null ");
			return;
		}

		cur.prev.next = cur.next;
		cur.next.prev = cur.prev;

		cur.next = null;
		cur.prev = null;
		System.out.println("Deleted: " + key);
	}

	public void dispForward()
	{
		if(header.next == header)
		{
			System.out.println("List is empty");
			return;
		}

		System.out.print("Forward : ");
		Node cur = header.next;
		while(cur != header)
		{

			System.out.print(cur.data + " <-> ");
			cur = cur.next;
		}
		System.out.println("back to header");
	}

	public void dispBackward()
	{

		if(header.prev == header)
		{
			System.out.println("List is empty");
			return;
		}

		System.out.print("Backward : ");
		Node cur = header.prev;
		while(cur != header)
		{
			System.out.print(cur.data +"<-> ");
			cur = cur.prev;
		}
		System.out.println("(back to header)");
	}

	public boolean isEmpty()
	{
		return header.next == header;
	}
}
class Demo01
{

	public static void main(String args[])
	{
		CircularD_H_L list = new CircularD_H_L();

		System.out.println("Manish Kumbhar");
		System.out.println("Roll No : 23 \n");

		list.insertEnd(10);
		list.insertEnd(20);
		list.insertEnd(30);


		list.insertBegin(5);
		list.insertBegin(2);

		list .dispForward();
		list.dispBackward();

		list.delete(20);
		list.dispForward();

		list.delete(2);
		list.delete(30);
		list.dispForward();
		list.dispBackward();



	}
}