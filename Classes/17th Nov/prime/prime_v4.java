import java.util.Scanner;
  // 2 3 4 5 6 7 8 9 ...........
// 2503
// 2 3 4 5 6 7 .............51
// 2 3 4 5 6 7 8 9 10 11
// 12 13 14 15 16 17 18 19 20 21
// 22 23 24 25 26 27 28 29 30 31
// 32 33 34 35 36 37 38 39 40 41
// 42 43 44 45 46 47 48 49 50 51
// 2 3 5 7 9  11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51
//2 3 5 7  11 13  17 19 23 25 29 31 35 37 41 43 47 49 
// 5 7 11 13 17 19 23 25 29 31 35 37 41 43 47 49
//  2 4  2  4  2  4  2  4
class prime_v4
{
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		long num;
		num = kbrd.nextLong();
		boolean factor_found_flag;
		factor_found_flag = false;
		long start_time = System.currentTimeMillis();
		long  cff;
		boolean add_2 = true;
		if ( num % 2 == 0)
			factor_found_flag = true;
		else
		{
		for ( cff = 3; cff < Math.sqrt(num);)
		{
		    if ( num % cff == 0 )
			{
			     factor_found_flag = true;
			     break;
			}
			if ( add_2 == true )
			{
				cff+=2;
				add_2 = false;
			}
			else
			{
				cff+=4;
				add_2 =  true;
			}
		}
		}
		// here
		long stop_time = System.currentTimeMillis();
		double duration = ( stop_time - start_time) / 1000.0;
		System.out.printf("%s , time taken = %.3f", 
		factor_found_flag == true ? "Composite" : "Prime", duration);
	}
}