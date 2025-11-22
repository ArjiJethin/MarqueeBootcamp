//import java.util.Scanner;
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include<math.h>
#include<time.h>
// stdin  stdout stderr


    int main( char * parameters[] )
	{

		int num;
		scanf("%d",&num);
		bool factor_found_flag;
		factor_found_flag = false;
		clock_t start_time = clock();
		int cff;
		for ( cff = 2; cff < sqrt(num); cff++)
		{
		    if ( num % cff == 0 )
			{
			     factor_found_flag = true;
			     break;
			}
		}
		// here
		clock_t stop_time = clock();
		double duration = ( stop_time - start_time) / 1000.0;
		printf("%s , time taken = %.3f",
		factor_found_flag == true ? "Composite" : "Prime", duration);

		return EXIT_SUCCESS;

}
