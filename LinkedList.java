package Linked_List;

public class LinkedList {
	
	public class Node{
		int data;
		Node next;
		public Node() {
			// TODO Auto-generated constructor stub
			this.data=0;
		}
		public Node(int item) {
			// TODO Auto-generated constructor stub
			this.data=item;
		}
	}
	 Node head;
	private Node tail;
	private int size;
	
	public void addFirst(int item) {
		Node nn=new Node(item);
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			nn.next=this.head;
			this.head=nn;
			this.size++;
		}
	}
	
	public void addLast(int item) {
		if(this.size==0) {
			this.addFirst(item);
		}
		else {
			Node nn=new Node(item);
			this.tail.next=nn;
			this.tail=nn;
			this.size++;
		}
	}
	public void addAtIndex(int item,int k) throws Exception {
		if(k<0||k>size) {
			throw new Exception("Index out of Bound");
		}
		if(k==0) {
			this.addFirst(item);
		}
		else if(k==size) {
			this.addLast(item);
		}
		else {
			Node nn=new Node(item);
			Node k_1th =getNode(k-1);
			nn.next=k_1th.next;
			k_1th.next=nn;
			this.size++;
		}
	}
	
	public int getFirst() throws Exception {
		if(this.head==null) {
			throw new Exception("List is Empty");
		}
		
			return this.head.data;
		
	}
	public int getLast() throws Exception {
		if(this.head==null) {
			throw new Exception("List is Empty");
		}
		
			return this.tail.data;
	}
	
	public int getAtNode(int k) throws Exception {
		return getNode(k).data;
	}
	
	public int removeFirst() throws Exception {
		if(this.head==null) {
			throw new Exception("List is Empty");
		}
		Node temp=this.head;
		this.head=this.head.next;
		temp=null;
		this.size--;
		return temp.data;		
	}
	public int removeLast() throws Exception {
		if(this.head==null) {
			throw new Exception("List is Empty");
		}
		if(size==1) {
			removeFirst();
		}
		Node temp=getNode(size-2);
		int rv=this.tail.data;
		this.tail=temp;
		this.tail.next=null;
		this.size--;
		return rv;
	}
	public int removeAtIndex(int k) throws Exception {
		if(k<0||k>=size) {
			throw new Exception("Index out of Bound");
		}
		if(k==0) {
			return removeFirst();
		}
		else if(k==size-1) {
			return removeLast();
		}
		else {
			Node kth=getNode(k);
			Node K_1th=getNode(k-1);
			K_1th.next=kth.next;
			kth.next=null;
			this.size--;
			return kth.data;
		}
		
	}
	
	private Node getNode(int k) throws Exception {
		if(k<0||k>=size) {
			throw new Exception("Index out of Bound");
		}
		Node temp=this.head;
		for(int i=1;i<=k;i++) {
				temp=temp.next;
			}	
		return temp;
	}
	public int size() {
		return this.size;
	}
	
	public void Display() {
		Node temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.println(".");
	}
	public void appendLastN(int n) throws Exception {
		Node slow=head;
		Node fast=head;
		for(int i=1;i<=n;i++){
			fast=fast.next;
		}
		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=head;
		head=slow.next;
		slow.next=null;
	}
	
}
