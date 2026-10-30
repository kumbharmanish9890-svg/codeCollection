class Node
{
	int data;
	Node next;


	Node(int data)
	{
		this.data = data;
		this.next=null;
	}
}
class CircularHeader
{

	Node header;


	public CircularHeader()
	{
		header = new Node(-1);
		header.next = header;
	}

	public void insertEnd(int data)
	{

		Node newNode = new Node(data);

		Node temp = header;
		while(temp.next != header)
		{
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = header;
	}
	public void insertBegin(int data)
	{

		Node newNode = new Node(data);

		newNode.next = header.next;
		header.next = newNode;

	}

	public void delete(int key)
	{
		Node temp = header;
		Node prev = null;

		while(temp.next != header && temp.next.data != key)
		{
			temp = temp.next;
		}
		if(temp.next == header)
		{
			System.out.println("Element Not Found");
			return;
		}
		temp.next = temp.next.next;
	}

	public void disp()
	{

		if(header.next == header)
		{
			System.out.println("List is empty");
			return;
		}

		 Node temp = header.next;
		 System.out.print("CHLL : ");

		 while(temp != header)
		 {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
		System.out.println("back to header");

	}
}
public class CHLLDemo
{

	public static void main(String args[])
	{

		CircularHeader list = new CircularHeader();

		System.out.println("Manish Kumbhar");
		System.out.println("Roll No : 23 \n");

		list.insertEnd(10);
		list.insertEnd(20);
		list.insertEnd(30);
		list.insertBegin(5);
		list.disp();
		list.delete(20);
		list.disp();


	}
}