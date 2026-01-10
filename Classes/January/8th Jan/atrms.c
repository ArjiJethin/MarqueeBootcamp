/*
153

3

1^3 + 5^3 + 3^3

1 + 125 + 27 = 153
Sum of indivudual digits raised to the power of number of digits of the
number if it equals the number, then the number is an
Armstrong number

1634
4
1^4 + 6^4 + 3^4 + 4^4

1   + 1296 + 81  + 256 => 1634


Find the number of digits


Split number into individual digits

find digit ^ nod
sum it

if sum and num are equal













*/


#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
// definition
   int num;
   int copy_num;
   int digit;
   int powered_digit;
   int sum;
   int nod_num;
 // populate
    scanf("%d", &num);
 // priming
 nod_num = 0;
 sum = 0;
 // process

 // find the number of digits

 copy_num = num;
 while ( copy_num != 0)
 {
    nod_num +=1;
    copy_num /= 10;

 }

 // split into digits, power, sum

 copy_num = num;
 while ( copy_num != 0)
 {

    digit = copy_num % 10;
    powered_digit = pow( digit, nod_num );
    sum += powered_digit;
    copy_num/=10;

 }
 printf("%s", sum == num  ? "Arms" : "NOT")
;




   return EXIT_SUCCESS;
}












