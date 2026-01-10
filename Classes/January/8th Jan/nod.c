#include<stdio.h>
#include<stdlib.h>
int main()
{
// variable definition
    int num;
    int copy_num;
    int digit;
    int nod_num; // number of digits of num
// populate

   scanf("%d", &num);
// priming
   nod_num = 0;
// process
   copy_num = num;
   while ( copy_num != 0 )
   {
   digit = copy_num % 10; // query the LSD
   //sod_num += digit;
   nod_num+=1;
   copy_num = copy_num / 10; // loose the LSD
   }
   printf("number of digits of %d = %d\n", num, nod_num);




   return EXIT_SUCCESS;
}
