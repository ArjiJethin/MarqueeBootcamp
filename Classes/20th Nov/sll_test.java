import java.util.Scanner;
import java.util.Random;

class node {
	int data;
	node next;

	node(int data) {
		this.data = data;
		next = null;
	}
}

class sll {
	node first;
	node last;
	int non; // number of nodes

	sll() {
		first = null;
		last = null;
		non = 0;
	}

	void addNode(int value) {
		node nn = new node(value);
		// empty
		if (non == 0) {
			first = nn;
			last = nn;
		} else
		// used
		{
			last.next = nn;
			last = nn;
		}
		non++;
	}

	void print() {
		node trav;
		for (trav = first; trav != null; trav = trav.next) {
			System.out.printf("%02d ", trav.data);
		}
		System.out.println();
	}

	void delNode(int delVal) {
		node trav;
		node prev;
		if (first == null)
		// exception EmptyList
		{
			System.out.println("Empty List!!!");
			return;
		}
		for (trav = first, prev = null; trav != null && trav.data != delVal; prev = trav, trav = trav.next)
			;
		if (trav == null) {
			// exception ValueNotFound
			System.out.printf("Value Not Found!!!");
			return;
		}

		// first node
		if (trav == first) {
			first = first.next;
		} else {
			prev.next = trav.next;
		}
		non--;

	}

	void addBegin(int data) {
		node nn = new node(data);
		if (first == null) {
			first = nn;
			last = nn;
		} else {
			nn.next = first;
			first = nn;
		}
		non++;
	}

	void addEnd(int data) {
		node nn = new node(data);
		if (first == null) {
			first = nn;
			last = nn;
		} else {
			last.next = nn;

			last = nn;
		}
		non++;
	}

	void addAt(int pos, int data) {
		// 0

		if (pos == 0) {
			addBegin(data);
		} else if (pos >= non) {
			addEnd(data);
		} else {
			// v
			// 0 1 2 3 4 5 6 7 8 9
			// 1 2 3 4 5 6 7 8 9 10
			// addAt ( 6, 0 );
			// 6->7
			// 6->0->7
			node trav;
			int moveCtr;
			for (moveCtr = 0, trav = first; moveCtr < pos - 1; moveCtr++, trav = trav.next)
				;
			node nn = new node(data);
			nn.next = trav.next;
			trav.next = nn;
		}
	}

	boolean isEmpty() {
		return non == 0;
	}

	int size() {
		return non;
	}

	void delAt(int pos) {
		// 0 1 2 3 4 5 6 7 8 9 10
		// 3 7 8 1 2 6 9 7 0 4
		// 5
		// 2->6->9
		// 2->9

		/*
		 * Pseudocode
		 * if pos < 0 return
		 * if pos >= non return
		 * 
		 * if pos == 0
		 * alter the first
		 * else
		 * travel
		 * alter the pointer
		 * 
		 * reduce non
		 * 
		 * 
		 * 
		 * 
		 */
		if (pos < 0)
			return;
		if (pos >= non)
			return;
		if (pos == 0) {
			first = first.next;
		} else {
			node trav;
			int moveCtr;
			for (trav = first, moveCtr = 0; moveCtr < (pos - 1); trav = trav.next, moveCtr++)
				;

			trav.next = trav.next.next;

		}

	}

	void printReverse() // wrapper
	{

		// arm length solution
		if (non == 0)
			return;
		if (non == 1) {
			print();
			return;
		}
		// set an environment

		// call a helper - recursive, pass the environment, initiate
		printReverse_helper(first);

	}

	private void printReverse_helper(node proc) {
		if (proc == null)
			return;
		printReverse_helper(proc.next);
		System.out.printf("%d ", proc.data);
	}

	// 1 2 3 4 5 6
	// a v r e f y
	// a v r e f y NO
	// 6
	// 5
	// 4
	// 3
	// 2
	// 1
	void reverse() {

	}

}

class sll_test {
	public static void main(String[] parameters) {
		sll list1 = new sll();
		int noe;
		Scanner kbrd = new Scanner(System.in);
		noe = kbrd.nextInt();
		Random rnd = new Random();
		int iter;
		for (iter = 0; iter < noe; iter++) {
			int value;
			value = rnd.nextInt() % 100;
			if (value < 0) {
				// abs
				// multiply -1
				// 0 - value
				// -
				value = -value;
			}
			if (value == 0) {
				value = 8;
			}
			list1.addNode(value);
		}
		list1.print();
		/*
		 * int delVal;
		 * delVal = kbrd.nextInt();
		 * list1.delNode( delVal );
		 * list1.print();
		 * delVal = kbrd.nextInt();
		 * list1.delNode( delVal );
		 * list1.print();
		 * delVal = kbrd.nextInt();
		 * list1.delNode( delVal );
		 * list1.print();
		 * 
		 * list1.addBegin ( 100 );
		 * list1.print();
		 * list1.addEnd( 999);
		 * list1.print();
		 * list1.addAt ( 6, 66);
		 * list1.print();
		 * list1.addAt ( 100, 111);
		 * list1.print();
		 * list1.addAt ( 0, 0);
		 * list1.print();
		 * list1.printReverse();
		 */

		list1.delAt(10);
		list1.delAt(0);
		list1.delAt(17);
		list1.print();

		kbrd.close();
	}
}
