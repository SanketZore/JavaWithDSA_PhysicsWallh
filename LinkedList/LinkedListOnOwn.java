package LinkedList;

import java.util.List;

import com.jmu11.classLoadingStaticNonStatic;

import LinkedList.LinkedList.Node;

public class LinkedListOnOwn {
	Node head;

	class Node{
		int data;
		Node next;
		Node(int value){
			data=value;
			next=null;
		}
	}
	
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=new Node(data);
			return;
		}
		newNode.next=null;
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		return;
	}
	
	public void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void deleteNode(int position) {
		if(head==null) {
			System.out.println("List is empty.");
			return;
		}
		Node temp=head;
		if(position==0) {
			head=temp.next;
			return;
		}
		for(int i=0;temp!=null && i<position-1;i++) {
			temp=temp.next;
		}
		if(temp==null && temp.next==null) {
			return;
		}
		temp.next=temp.next.next;
	}

	
	public void display() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	
	public void insertBetween(Node prev,int data) {
		if(prev==null) {
			System.out.println("Previous Node cannot contain null value.");
			return;
		}
		Node newNode=new Node(data);
		newNode.next=prev.next;
		prev.next=newNode;
	}
	
	public static void main(String[] args) {

		LinkedListOnOwn list= new LinkedListOnOwn();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtBeginning(5);
		list.insertBetween(list.head.next, 15);
		list.display();
		System.out.println("");
		list.deleteNode(2);
		list.display();
		
	}

}
