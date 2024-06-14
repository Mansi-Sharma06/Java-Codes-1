package linkedlist;

import java.util.Scanner;

public class LLuse {
	
	public static Node<Integer> takeinput(){
		
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer> (data);
			if(head == null) {
				head = newNode;
			} else {
				Node<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			data = s.nextInt();
 		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		
		while(head!= null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeinput();
		print(head);
	}
}
