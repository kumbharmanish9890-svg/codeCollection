 class DoublyLL {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data= data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    DoublyLL(){

        this.head = null;
        this.tail =null;
        this.size = 0;
    }

    public void insertAtHead(int data)
    {
		Node newNode = new Node(data);

		if(head == null && tail == null)
		{
			 head = newNode;
			tail = newNode;
		}else{

			newNode.next = head;
			head.prev = newNode;
			head = newNode;
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
		}else{

			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;

	}
	public void insertAtPosition(int position, int data) {

	if(position < 1 || position > size +1)
		{
			System.out.println("invalid Position");
			return;
		}
		if(position == 1)
		{
			insertAtHead(data);
			return;
		}
		if(position == size + 1)
		{
			insertAtTail(data);
			return;
		}

		Node temp = head;

		for(int i = 1 ;i<= position -2;i++)
		{
			temp = temp.next;
		}

		Node prevNode = head;
		Node nextNode = prevNode.next;
		Node currNode = new Node(data);


		currNode.prev = prevNode;
		prevNode.next = currNode;
		currNode.next = nextNode;
		nextNode.prev = currNode;

		size ++ ;



	}
	public void disp()
	{
		Node temp = head;
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}

		while(temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();

	}
	 public void PrintBackward()
	{

		Node temp = tail;

		while(temp != null)
		{
			System.out.print("<-"+temp.data);
			temp = temp.prev;
		}
		System.out.println();

	}
	public boolean searchLL(int target)
	{
		if(head == null)
		{
			System.out.println("list is empty");
			return false;
		}

		Node temp = head;
		while(temp != null)
		{
			if(temp.data == target)
			{
				return true;

			}else
			{
				temp = temp.next;
			}
		}
		return false;

	}
	public void updateVal(int oldVal,int newVal)
	{

		Node temp = head;

		if(head == null)
		{
			System.out.println("list is empty");
			return;
		}
		while(temp != null)
		{
			if(temp.data == oldVal)
			{
				temp.data = newVal;
			}else{

				temp = temp.next;


			}
		}

	}

	public void delAtHead()
	{
		if(head == null)
		{
			System.out.println("list is empty cant detete head");
			return;
		}
		if(head == tail)
		{
			head = null;
			tail = null;
			return;
		}

		head = head.next;
		head.prev = null;
		size --;

	}
	public void delAtTail()
	{

		if(head  == null &&  tail == null)
		{
			System.out.println("List is empty can't detele ");
			return;
		}
		if(head == tail)
		{
			tail =null;
			head = null;
			size = 0;
			return;
		}

		tail = tail.prev;
	 	tail.next = null;
	 	size --;
	}
	public void delAtPos(int pos)
	{
		if(pos < 1 || pos > size )
		{
			System.out.println("invalid position");
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

		Node currNode = head;
		//Node temp = head;

		for(int i = 1 ;i<=pos -1;i++)
		{
			currNode = currNode.next;
		}

		Node prevNode = currNode.prev;
		Node nextNode = currNode.next;

		prevNode.next = nextNode;
		nextNode.prev = prevNode;
		currNode.prev = null;
		currNode.next = null;

		size --;
	}



	public static void main(String args[]){

		DoublyLL obj = new DoublyLL();
		obj.insertAtHead(90);
		obj.disp();

		obj.insertAtTail(10);
		obj.disp();
		obj.insertAtPosition(2, 400);
		obj.disp();

		obj.insertAtHead(200);
		obj.PrintBackward();

		System.out.println(obj.searchLL(400));
		obj.disp();

		obj.updateVal(200, 10);
		obj.disp();

		obj.insertAtHead(400);
		obj.disp();


		obj.updateVal(400, 20);
		obj.disp();

		obj.delAtHead();
		obj.disp();

		obj.delAtPos(2);
		obj.disp();

    }

}
