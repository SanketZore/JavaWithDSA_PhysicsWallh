package AlphaPayments;

import java.util.prefs.NodeChangeEvent;

public class linkedListProgram {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int value){
			this.data=value;
			this.next=null;
		}
	}
	
	public void insertAtEnd(int value) {
		Node newNode=new Node(value);
		
		if(head==null) {
			head=new Node(value);
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		return;
	}
	
	
	public void disp() {
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;	
		}
		System.out.print("null");
	}
	
	public void reverseList() {
		if(head==null|| head.next==null) {
			return;
		}
		Node prevNode=head;
		Node currNode=head.next;
		while(currNode!=null) {
			Node nextNode=currNode.next;
			currNode.next=prevNode;
			
			prevNode=currNode;
			currNode=nextNode;
		}
		head.next=null;
		head=prevNode;
	}
	
	public Node reverseRecursion(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node newHead=reverseRecursion(head.next);
		head.next.next=head;
		head.next=null;
		return newHead;
	}
	
	
	public static void main(String[] args) {
		linkedListProgram linkedL=new linkedListProgram();
		linkedL.insertAtEnd(20);
		linkedL.insertAtEnd(10);
		linkedL.insertAtEnd(70);
		linkedL.insertAtEnd(30);
		linkedL.insertAtEnd(40);
		linkedL.disp();
		System.out.println();
		linkedL.reverseList();
		linkedL.disp();
		System.out.println();
		linkedL.head= linkedL.reverseRecursion(linkedL.head);
		linkedL.disp();
		
		
	}

}
