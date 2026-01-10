#include<stdio.h>
#include<stdlib.h>
int main()
{
// variable definition
    int num;
    int copy_num;
    int digit;
    int sod_num; // sum of digits of num
// populate

   scanf("%d", &num);
// priming
   sod_num = 0;
// process
   copy_num = num;
   while ( copy_num != 0 )
   {
   digit = copy_num % 10; // query the LSD
   sod_num += digit;
   copy_num = copy_num / 10; // loose the LSD
   }
   printf("Sum of digits of %d = %d\n", num, sod_num);




   return EXIT_SUCCESS;
}
