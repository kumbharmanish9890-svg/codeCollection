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
			newNode = head;
			newNode = tail;
		}else{

			newNode.next = head;
			head.prev = newNode;
			newNode = head;
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

		while(temp != null)
		{
			System.out.print(temp + "->");
			//temp ++;
		}
		System.out.println();

	}



    public static void main(String args[]){

		DoublyLL obj = new DoublyLL();
		obj.insertAtHead(10);
		obj.disp();

    }

}
