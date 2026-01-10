import java.util.Scanner;

class leap {
	public static void main(String[] parameters) {
		int year;
		Scanner kbrd = new Scanner(System.in);
		year = kbrd.nextInt();

		kbrd.close();
		// from the stream connected to keyboard
		// scan a token and convert it into an integer
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.printf("LEAP - Div by 4 and 100 and 400");

				} else {
					System.out.printf("NOT LEAP - Div by 4 and 100 BUT not by 400");

				}

			} else {
				System.out.printf("LEAP Div by 4 but not by 100");
			}
		} else {
			System.out.printf("NOT - NOT divi by 4");
			// class static method
			// obj
		}

	}
}