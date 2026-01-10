/*

abcdefedcbayes
a						1
ab 						0
abc						0
abcd 					0
abcde					0
abcdef      			0
abcdefe 				0 
abcdefed				0


abcdefedcba 			11
*/

class largest_prefix_palndrome {
	public static boolean checkPalin(String str, int end) {
		int first;
		int last;
		first = 0;
		last = end;
		while (first <= last) {
			if (str.charAt(first) == str.charAt(last)) {
				first++;
				last--;
			} else
				return false;
		}
		return true;
	}

	@SuppressWarnings("unused")
	public static void main(String[] parameters) {
		// 01234567890
		String str = "abcdefedcbayes";
		int str_index;
		int last_index;
		int palin_len;
		int max_palin_len;
		str_index = 0;
		palin_len = 1;
		int stored = 0;
		for (last_index = 1; last_index < str.length(); last_index++) {
			if (checkPalin(str, last_index)) {
				palin_len = (last_index + 1) - str_index;
				stored = last_index;
			}
		}
		StringBuilder prefix = new StringBuilder(str.substring(stored + 1));
		prefix.reverse();
		String res = (prefix.toString()) + str;
		System.out.printf("prefix len = %d %s\n", str.length() - palin_len, res);
	}
}
