package LinkedList;


public class LinkedList {
	
	Node head;		// head is initialized to null.
	
	class Node{
		int data;
		Node next;
		
		Node(int d){			// constructor to initialize object data.
			data=d;
			next=null;
		}
	}
	
	public void insertAtEnd(int newData) {
		Node newNode=new Node(newData);   // newNode created
		
		if(head==null) {				//check head is null or not.
			head=new Node(newData);
			return;
		}
		newNode.next=null;
		Node temp=head;			// traversal pointer.
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		return;
		
	}
	
	public void insertAtBeginning(int newData) {
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	
	public void displayLinkedList() {		// Time complexity= O(1)
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
	}
	
	public void insertAfter(Node prev_node, int newData) {
		if(prev_node==null) {
			System.out.println("The Previous Node cannot contain null value.");
			return;
		}
		Node newNode=new Node(newData);
		newNode.next=prev_node.next;
		prev_node.next=newNode;
	}
	
	public void deleteNode(int position) {
		if(head==null) {
			System.out.println("Linked List Empty");
			return;
		}
		Node temp=head;
		if(position==0) {   //deletion at beginning, Time complexity= O(1), space complexity is constant.
			head=temp.next;
			return;
		}
		for(int i=0;temp!=null && i<position-1;i++) { // deletion at any point, Time complexity= O(1)
			temp=temp.next;
		}
		if(temp==null && temp.next==null) {
			return;
		}
		temp.next=temp.next.next;
	}
	
	public void reverseLLIteratively() {
		Node curr=head;
		Node prev=null;
		Node nextPtr=null;
		
		while(curr!=null) {
			nextPtr=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextPtr;
		}
		head=prev;
		return;
	}

	public static void main(String[] args) {

		/*
		 Time Complexity to insert node:  
		 	if n nodes then time complexity is:O(n)
		 	
		Time Complexity of Reverse Lined List Iteratively: O(n)   
		Space Complexity: O(1).  	where, n = no.of Nodes.
		 */
		
		LinkedList llist=new LinkedList();
		llist.insertAtEnd(52);
		llist.insertAtEnd(45);
		llist.insertAtEnd(92);
		llist.insertAtBeginning(100);
		llist.insertAtBeginning(10);
		llist.displayLinkedList();
		llist.insertAfter(llist.head.next.next, 13);
		System.out.println("");
		llist.displayLinkedList();
//		llist.deleteNode(3);
//		System.out.println("\nDeletion of a Node from a LinkedList");
//		llist.displayLinkedList();
		
		System.out.println("");
		llist.reverseLLIteratively();
		System.out.println("Reversal in a Linked List: ");
		llist.displayLinkedList();
	}

}
