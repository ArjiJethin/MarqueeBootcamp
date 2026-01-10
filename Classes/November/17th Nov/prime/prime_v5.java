import java.util.Scanner;

// 200/4= 50
//  200=4 *50
// 200 = 50 * 4
// prod = a * b
// a = prod / b
// b = prod / a
//100=10*10
// 133 49 121 169
class prime_v5 {
	public static void main(String[] parameters) {
		Scanner kbrd = new Scanner(System.in);
		long num;
		num = kbrd.nextLong();
		boolean factor_found_flag;
		factor_found_flag = false;
		long start_time = System.currentTimeMillis();
		long[] cff = { 7, 11, 13, 17, 19, 23, 29, 31 };
		int cff_ind;
		if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
			factor_found_flag = true;
		else {
			cff_ind = 0;
			// 133 169
			// cff_ind 0 1 2
			while (true) {
				if (cff[cff_ind] * cff[cff_ind] > num)
					break;

				if (num % cff[cff_ind] == 0) {
					factor_found_flag = true;
					break;
				} else {
					cff[cff_ind] += 30;
					cff_ind++;
					if (cff_ind == 8)
						cff_ind = 0;
				}

			}
		}
		// here
		long stop_time = System.currentTimeMillis();
		double duration = (stop_time - start_time) / 1000.0;
		System.out.printf("%s , time taken = %.3f",
				factor_found_flag == true ? "Composite" : "Prime", duration);
		kbrd.close();
	}
}