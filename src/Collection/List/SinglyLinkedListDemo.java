package Collection.List;

import java.util.List;

import ArrayListImpl.MyList;

public class SinglyLinkedListDemo {

	// Display the LinkedList
	public void displayList(ListNode head) {
		ListNode currnetNode = head;

		while (currnetNode != null) {
			System.out.print(currnetNode.data + "-->");
			currnetNode = currnetNode.next;
		}
		System.out.println(currnetNode);
	}

	//reversing the List
	public ListNode reverseList(ListNode head)
	{
		 ListNode next = null;
		 ListNode previous = null;
		 ListNode current = head;
		 
		 while(current!=null)
		 {
			 next = current.next;
			 current.next= previous;
			 previous = current;
			 current = next;
			// System.out.print(current.data + "-->");
		 }
		 //System.out.println("NOde"+" "+head);
		 return previous;
	}
	
	// Return the length of the LinkedList;
	public int length(ListNode head) {
		ListNode currentNode = head;
		int size = 0;
		while (currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}
		return size;
	}

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			// this.next = null;
		}
	}

	public static void main(String args[]) {
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(12);
		ListNode third = new ListNode(32);
		ListNode fourth = new ListNode(21);

		// Attach them together to form a list
		head.next = second; // 10-->12
		second.next = third;// 10-->12-->32
		third.next = fourth;// 10-->12-->21

		SinglyLinkedListDemo demo = new SinglyLinkedListDemo();
		demo.displayList(head);
		ListNode s = demo.reverseList(head);
		demo.displayList(s);

		System.out.print("Size of the Linked List" + " " + demo.length(head));

	}

}
