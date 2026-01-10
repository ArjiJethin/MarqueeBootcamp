// 2223

// 4941729
// 1729
//  494
// 2223\
// 4941729
// 494172	9		10
// 49417	29		100
// 4941		729		1000
// 494		1729	10000
//       abvcdef
//			  10
//           100
//          1000
//         10000
//        100000
//       1000000
//      10000000
//     100000000 

//			6974
//            10	697 	4
//           100	69		74
//			1000	6		974
//         10000
import java.util.Scanner;
class kaprekar
{
	public static void main( String [] parameters )
	{
		long num;
		long  sqr_num;
		long part1;
		long part2;
		long sum;
		long power;
		Scanner kbrd = new Scanner ( System.in );
		num = kbrd.nextLong();
		sqr_num =  num * num ;
		power = 10;
		
		while ( power < sqr_num )
		{
		   part1 = sqr_num / power;
		   part2 = sqr_num % power;
		   System.out.printf("D : %d %d\n", part1,part2);
		   sum = part1 + part2;
		   if ( sum == num )
		   {
		       System.out.printf("sqr is %d , %d + %d = %d", sqr_num, part1, part2, sum);
			   break;
		   }
		   power *= 10;
		}
		
		
		
		
		
	}
}


















