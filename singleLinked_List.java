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

	public boolean Search(int t)
	{
		Node temp = head;
		while (temp!= null) {
			if(temp.data == t)	
			{
				return true;
			}else{
				temp = temp.next;
			}
			
		}
		return  false;
	}
	public int FindPosition(int t)
	{
		Node temp = head;
		int pos = 1;
		while (temp != null) {
			if(temp.data == t)
			{
				return pos;
			}else{
				temp = temp.next;
				pos++;
			}
			
		}
		return -1;
		
	}
    public void updatePos(int position,int newData)
    {
        if(position < 1 || position > size)
            {
                System.out.println("invalid Position !");
                return;
            } 
        Node t = head;
        for(int i=1;i<=position -1;i++)
        {
            t = t.next;
        }
        t.data = newData;

    }
    public void updateVal(int oldV,int newV)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == oldV)
            {
                temp.data = newV;
            }
            temp = temp.next;

        }


    }
    public void delHead()
    {
        if(head == null)
            {
                System.out.println("List is empty");
                return;
            }   

            head = head.next;
            size--;
            if(head == null)
            {
                tail = null;
            }
    
    }
    public void delTail()
    {
        if(head == null )
        {
            System.err.println("list is empty");
            return;
        }

        if(head == tail)
        {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        for(int i = 1;i<=size-2;i++)
        {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size --;

    }
    public void delAtPos(int pos)
    {
        if(pos<1 || pos  > size + 1)
        {
                System.out.println("Invalid Position");
                return;
        }
        if(pos == 1)
        {
            delHead();
            return;
        }
        if(pos == size)
        {
            delTail();
            return;
        }
        Node prev = head;
        for(int i = 1;i<=pos-2;i++)
        {
            prev = prev.next;
        }
        Node curr = prev.next;
        Node forward = curr.next;

        prev.next = forward;
        curr.next = null; 

        size --;
    }
	// public void delValue(int val)
	// {
	// 	if(head == null)
	// 	{
	// 		System.out.println("list is empty");
	// 		return;
	// 	}
	// 	if(head.data == val)
	// 	{
	// 		delHead();
	// 		return;
	// 	}

	// 	Node temp = head;

	// 	for(int i = 1;temp.next != null;i++)
	// 	{
	// 		if(temp.next.data == val)
	// 		{

	// 			temp.next = temp.next.next;
	// 			size --;
	// 			return;
	// 		}
	// 		temp = temp.next;

	// 	}
	// 	System.out.println("Value Not found");
	// }
	public boolean deleteValue(int target)
	{
		if(head == null)
		{
			System.out.println("List is empty ,cont delete value");
			return false;
		}
		if(head.data == target)
		{
			delHead();
			return true;
		}
		Node prev = head;
		Node curr = head.next;

		while (curr != null) {

			if(curr.data == target)
			{
				Node forward = curr.next;

				prev.next = forward;
				curr.next= null;

				if(tail == curr)
				{
					tail = prev;
				}
				size --;
				return true;
			}else{
				prev = prev.next;
				curr = curr.next;
			}
			
		}
		return false;
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

		System.out.println(l.Search(101));
		System.out.println(l.FindPosition(500));

        l.updatePos(9,56);
        l.PrintList();
        
        
        l.updateVal(500, 23);
        l.PrintList();

        l.delHead();
        l.PrintList();

        l.delHead();
        l.PrintList();

        l.delTail();
        l.PrintList();

        l.delTail();
        System.out.println("Size of List "+ l.getSize());
        l.PrintList();

        l.delAtPos(3);
        l.PrintList();

		// l.delValue(30);
		// l.PrintList();

		// l.delValue(101);
		// l.PrintList();

		l.deleteValue(30);
		l.PrintList();

		l.deleteValue(23);
		l.PrintList();
	}
}