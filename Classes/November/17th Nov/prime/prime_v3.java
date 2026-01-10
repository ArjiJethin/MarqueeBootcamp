import java.util.Scanner;

// 2 3 4 5 6 7 8 9 ...........
// 2503
// 2 3 4 5 6 7 .............51
// 2 3 4 5 6 7 8 9 10 11
// 12 13 14 15 16 17 18 19 20 21
// 22 23 24 25 26 27 28 29 30 31
// 32 33 34 35 36 37 38 39 40 41
// 42 43 44 45 46 47 48 49 50 51
class prime_v3 {
	public static void main(String[] parameters) {
		Scanner kbrd = new Scanner(System.in);
		long num;
		num = kbrd.nextLong();
		kbrd.close();
		boolean factor_found_flag;
		factor_found_flag = false;
		long start_time = System.currentTimeMillis();
		long cff;
		if (num % 2 == 0)
			factor_found_flag = true;
		else {
			for (cff = 3; cff < Math.sqrt(num); cff += 2) {
				if (num % cff == 0) {
					factor_found_flag = true;
					break;
				}
			}
		}
		// here
		long stop_time = System.currentTimeMillis();
		double duration = (stop_time - start_time) / 1000.0;
		System.out.printf("%s , time taken = %.3f",
				factor_found_flag == true ? "Composite" : "Prime", duration);
	}
}