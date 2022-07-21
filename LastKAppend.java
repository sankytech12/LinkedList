package Linked_List;



public class LastKAppend {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(2);
		ll.addLast(1);
		ll.addLast(8);
		ll.addLast(5);
		ll.addLast(6);
		ll.Display();
		ll.appendLastN(3);		
		ll.Display();
	}
}
