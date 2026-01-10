
/*


+--------------+----------+
|  data        | link(s)  |
+--------------+----------+

*/
import java.util.Scanner;

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}
}

class stack_node {
	Node waiting;
	stack_node s_next;

	stack_node(Node keep) {
		waiting = keep;
		s_next = null;
	}
}

class stack {
	stack_node top;

	stack() {
		top = null;
	}

	boolean isEmpty() {
		return top == null;
	}

	void push(Node keep) {
		stack_node snn = new stack_node(keep);
		if (top == null)
			top = snn;
		else {
			snn.s_next = top;
			top = snn;
		}
	}

	Node pop() {
		Node gb = top.waiting;
		top = top.s_next;
		return gb;
	}
}

class sll {
	Node head;
	Node last;
	int non;

	sll() {
		head = null;
		last = null;
		non = 0;
	}

	void addNode(int data) {
		Node newNode = new Node(data);
		if (non == 0) {
			head = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		non++;
	}

	void show() {
		Node trav;
		for (trav = head; trav != null; trav = trav.next) {
			System.out.printf("%d ", trav.value);
		}
		System.out.println();
	}

	void rev_print() {
		stack s = new stack();
		for (Node trav = head; trav != null; trav = trav.next) {
			s.push(trav);
		}
		while (s.isEmpty() != true) {
			Node proc = s.pop();
			System.out.printf("%d ", proc.value);
		}
	}

	void reverse() {
		Node prevNode;
		Node currNode;
		Node nextNode;

		prevNode = null;
		currNode = head;
		nextNode = head.next;
		while (currNode != null) {
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
			if (currNode != null) {
				nextNode = currNode.next;
			}
		}
		Node temp;
		temp = head;
		head = last;
		last = temp;

	}

}

class sll_user {
	public static void main(String[] parameters) {
		Scanner kbrd = new Scanner(System.in);
		int noe;
		noe = kbrd.nextInt();
		sll ourList = new sll();
		for (int data = 1; data <= noe; data++) {
			ourList.addNode(data);
		}
		ourList.show();
		ourList.reverse();
		ourList.show();
		ourList.rev_print();
		kbrd.close();

	}
}