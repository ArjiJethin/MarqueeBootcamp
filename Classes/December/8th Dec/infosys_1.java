/*
76923%9	0	9
23791%9	4	4
26350%9	7	7
12345%9	6	6
6789543210	9
dig = n % 9
if dig = 0
   dig = 9
(n-1)%9 + 1
(1234567890)
1	1
123	
123-1
122 % 9 5 + 1   
   
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9

10  11 12 13 14 15 16 17 18 19
20  21 22 23 24 25 26 27 28 29
18 2 2005
2  8 2004
2     5
Moon 

9  9
   life
   122 5! = 120
   
   
   
   
   
   40320
   8
   
   2333332223
   
   8
   
   
   array of integers
   
   every element find the unit sum
   
   find the factorial of it
   
   10^7
   1 1 1 1  2  3   3    4     5     6
   1 1 2 6 24 120 720 5040 40320 362880
   0 1 2 3 4  5    6    7    8      9
   Look up table
   
   87565 980698 1243126 873487 876 947
     4    3        1       1    3   2
	122
	5
	120
	*/

@SuppressWarnings("unused")
class infosys_1 {
	static int[] factorials;
	static {
		int num;
		int res;
		int n;
		factorials = new int[10];
		factorials[0] = 1;
		for (n = 1; n < 10; n += 1)
			factorials[n] = factorials[n - 1] * n;

	}

	// arr fact
	// 122 120
	// 122 2
	// 12 2
	// 1 1
	//
	// 637218 326880
	static boolean match(long n1, long n2) {
		int digit_n1;
		int digit_n2;
		int copy;
		long copy_n1;
		long copy_n2;
		boolean digit_found;
		copy_n1 = n1;
		copy_n2 = 0;
		while (copy_n1 != 0) {
			copy_n2 = n2;
			// System.out.printf("debug %d %d\n", copy_n1, copy_n2 );

			digit_n1 = (int) (copy_n1 % 10);
			digit_found = false;
			while (copy_n2 != 0) {
				digit_n2 = (int) (copy_n2 % 10);
				if (digit_n1 == digit_n2) {
					digit_found = true;
					break;
				}
				copy_n2 /= 10;
			}
			if (digit_found == false)
				return false;
			copy_n1 /= 10;
		}
		return true;
	}

	public static void main(String[] parameters) {
		long[] test = { 547, 797719, 545457, 60336, 345791, 55447, 2333332223L, 637218, 30764, 93915, 7272222, 928455,
				2794736, 3705, 26238321, 9899, 1983, 9556332, 9775522, 972179, 3045, 90328, 123805, 240638529, 53814,
				673982, 498321 };
		// long test [ ] ={2333323223L, 637218};
		int test_ind;
		for (test_ind = 0; test_ind < test.length; test_ind++) {
			int unit_sum_digit = (int) ((test[test_ind] - 1) % 9 + 1);
			if (match(test[test_ind], factorials[unit_sum_digit]))
				System.out.println(test[test_ind]);
		}
	}
}
