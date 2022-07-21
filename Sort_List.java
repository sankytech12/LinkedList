package Linked_List;

import Linked_List.Intersection_of_Two_Linked_Lists.ListNode;

public class Sort_List {
	public class ListNode {
		   int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	class Solution {
	    public ListNode sortList(ListNode head) {
	        if(head==null||head.next==null) {
	        	return head;
	        }
	    	
	    	ListNode mid=middleNode(head);
	    	ListNode headB=mid.next;
	    	mid.next=null;
	    	ListNode A=sortList(head);
	    	ListNode B=sortList(headB);
	    	return mergeTwoList(A, B);
	    	
	    }
	    public ListNode middleNode(ListNode head) {
	    	ListNode s=head;
	    	ListNode f=head;
	    	while(f.next!=null&&f.next.next!=null) {
	    		f=f.next.next;
	    		s=s.next;
	    	}
	    	return s;
	    }
	    public ListNode mergeTwoList(ListNode list1,ListNode list2) {
	    	ListNode Dummy=new ListNode();
	    	ListNode temp=Dummy;
	    	while(list1!=null&&list2!=null) {
	    		if(list1.val<list2.val) {
	    			temp.next=list1;
	    			temp=temp.next;
	    			list1=list1.next;
	    		}
	    		else {
	    			temp.next=list2;
	    			temp=temp.next;
	    			list2=list2.next;
	    		}
	    	}
	    	if(list1==null) {
	    		temp.next=list2;
	    	}
	    	if(list2==null) {
	    		temp.next=list1;
	    	}
	    	return Dummy.next;
	    }
	}
}
