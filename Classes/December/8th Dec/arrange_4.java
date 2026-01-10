import java.util.Scanner;
// class scanner is loaded

class arrange_4 {
	public static void main(String[] parameters) {

		int n1;
		int n2;
		int n3;
		int n4;
		Scanner kbrd = new Scanner(System.in);
		n1 = kbrd.nextInt();
		n2 = kbrd.nextInt();
		n3 = kbrd.nextInt();
		n4 = kbrd.nextInt();
		kbrd.close();

		int l1; // first largest
		int l2; // second largest
		int l3; // third largest
		int l4; // fourth largest
		l1 = Math.max(Math.max(n1, n2), Math.max(n3, n4));
		l4 = Math.min(Math.min(n1, n2), Math.min(n3, n4));
		l2 = Math.min(Math.max(n1, n2), Math.max(n3, n4));
		l3 = Math.max(Math.min(n1, n2), Math.min(n3, n4));
		// 1 2 3 4
		// l4 4
		// l1 1
		// l2 2
		// l3 3
		if (l2 < l3) {
			// swap
			// temp
			int temp = l2;
			l2 = l3;
			l3 = temp;

		}
		System.out.printf("%d < %d < %d < %d", l4, l3, l2, l1);

	}
}