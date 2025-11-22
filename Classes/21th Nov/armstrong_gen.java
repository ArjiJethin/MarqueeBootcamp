import java.util.Scanner;
class armstrong_gen
{
	public static int numberOfDigits ( int data )
	{
		int copy_data;
		int nod;
		for ( nod=0, copy_data = data; copy_data >0; nod++, copy_data/=10);
        return nod;		
	}
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		int range;
		int number;
		int nod_number;
		int sum;
		int digit;
		int copy_number;
		int powered_digit;
		range = kbrd.nextInt();
		long start = System.currentTimeMillis();
		for( number = 1; number <= range;number++)
		{
		 //nod_number = (int)(Math.floor (Math.log10 ( number )))+1;
		 nod_number = numberOfDigits( number );
		 sum = 0;
		 copy_number = number;
		 while ( copy_number != 0)
		 {
		 digit = copy_number % 10;
		 powered_digit = (int )Math.pow(digit, nod_number);
         sum+=powered_digit;
		 if ( sum > number )
			 break;
		 copy_number /= 10;
		 }
		 if ( sum == number )
		    System.out.printf("%d ", number);
		}
		long stop = System.currentTimeMillis();
		double duration = ( stop - start ) / 1000.0;
		System.out.printf("\nDuration = %.3f", duration);
	}
}