package Linked_List2;

public class Cycle_rem {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

	}

	private Node head;
	private int size;
	private Node tail;

	public void addfrist(int item) {

		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;

		}

	}

	public void addlast(int item) {
		if (this.size == 0) {
			addfrist(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	public void CreateCycle() {
		// this.tail.next = this.head.;// circular
		this.tail.next = this.head.next.next;// cycle
	}

	public Node hasCycle() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return slow;
			}

		}

		return null;
	}
	public void RemCycle1() {
		Node m=hasCycle();
		if(m==null) {
			return;
		}
		
		Node start=head;
		while(start!=null) {
			Node temp=m;
			while(temp.next!=start) {
				if(temp.next==start) {
					temp.next=null;
					return;
				}
				temp=temp.next;
			}
			start=start.next;
		}
		
	}
	public void RemCycle2() {
		Node m=hasCycle();
		if(m==null) {
			return;
		}
		Node temp=m;
		int count=1;
		while(temp.next!=m) {
			count++;
			temp=temp.next;
		}
		Node fast=head;
		for(int i=1;i<=count;i++) {
			fast=fast.next;
		}
		Node slow=head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
	}
	public void floydCycle() {
		Node m=hasCycle();
		if(m==null) {
			return ;
		}
		Node fast=m;
		Node slow=head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
	}
}
