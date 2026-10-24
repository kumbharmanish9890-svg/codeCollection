class Node
{
    int val;
    Node next;

    Node(int v)
    {
        val = v;
        next  = null;
    }
}
public class linkList
{
    static void dispList(Node h){
        Node current = h;
        while(current != null)
        {
            System.out.print(current.val);
            if(current.next !=null)
            {
                System.out.print("->");
            }
             current = current.next;
        }
        System.out.println();

    }

    public static void main(String args[])
    {
        Node head = new Node(30);
        head.next = new Node(31);
        head.next.next = new Node(32);
        head.next.next.next = new Node(33);
        System.out.println("The Linked List is : ");
        dispList(head);
    }
}