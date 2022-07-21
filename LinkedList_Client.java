package Linked_List;

import java.util.Scanner;

import Linked_List.LinkedList.Node;
import Linked_List.Merge_Two_Sorted_Lists.ListNode;

//	import java.util.LinkedList;
public class LinkedList_Client {

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
		ll.appendLastN(1);
		ll.Display();
	}

}
