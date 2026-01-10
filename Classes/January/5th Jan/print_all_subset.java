/*
00000

11111



13 01101
       1
query

		&     		QUERY A STATE
		|			SWITCH ON A BIT
		^			TOGGLE 
		<<			LEFT SHIFT OR MULTIPLY BY 2
		>>			RIGHT SHIFT OR DIVIDE BY 2
		>>> OR/AND <<< 


        01101
		  ^
		00100    &
        00100      ON 
        num & mask 
        ccecc
		0111010
		^
		      ^
        1000000
		0100000
		0010000
		0001000
		
		0111001
		      1




	   

*/
class print_all_subset {
	public static void main(String[] parameters) {
		// 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 1
		char[] name = { 's', 'r', 'i', 'd', 'h', 'a', 'r' };
		int len_name = name.length;
		int till;
		till = (int) Math.pow(2, len_name);
		int num;
		int bitPos;
		int mask;
		for (num = 0; num < till; num++) {
			mask = 1 << (len_name - 1);

			System.out.printf("{ ");
			for (bitPos = 0; bitPos < len_name; bitPos++) {
				if ((num & mask) == mask) {
					// process
					System.out.printf("%c ", name[bitPos]);
				}
				mask >>= 1;
			}
			System.out.printf("}\n");

		}
	}
}