import java.util.Scanner;
        
class prime_v2
{
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		int num;
		num = kbrd.nextInt();
		boolean factor_found_flag;
		factor_found_flag = false;
		long start_time = System.currentTimeMillis();
		int cff;
		for ( cff = 2; cff < Math.sqrt(num); cff++)
		{
		    if ( num % cff == 0 )
			{
			     factor_found_flag = true;
			     break;
			}
		}
		// here
		long stop_time = System.currentTimeMillis();
		double duration = ( stop_time - start_time) / 1000.0;
		System.out.printf("%s , time taken = %.3f", 
		factor_found_flag == true ? "Composite" : "Prime", duration);
	}
}