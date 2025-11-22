import java.util.Scanner;
class converter
{

    public static int toDecimal( long  inBinary)
	{
	    int bit;
		int res;
		int twos_powers;
		long copy_inBinary;
		twos_powers = 1;
		copy_inBinary = inBinary;
		res = 0;
		while ( copy_inBinary != 0)
		{
		   bit = (int)(copy_inBinary % 10);
		   res = res + bit * twos_powers;
		   twos_powers  *= 2;
		   copy_inBinary /= 10;
		   
		}
		return res;
	}
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		long inBin;
		int inDeci;
		inBin = kbrd.nextLong();
		inDeci = toDecimal( inBin );
		System.out.printf("%d in base2 = %d in base 10 %c", inBin, inDeci,7);
	}
}