class linked_L_cycle{

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null)
        {
			fast = fast.next;
			if(fast != null)
			{
				fast = fast.next;
				slow = slow.next;
			}
			if(fast == slow)
			{
				return true;
			}
		}
		return false;
    }

    public static void main(String args[])
    {
        ListNode head = new ListNode(78);
        head.next = new ListNode(56);
        head.next.next = head;
        linked_L_cycle solution = new linked_L_cycle();
        boolean result = solution.hasCycle(head);
        System.out.println(result);
    }
}