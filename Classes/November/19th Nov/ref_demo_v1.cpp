#include<stdio.h>
#include<stdlib.h>
void swap_val ( int  num1, int num2  )
{
   int temp;
   temp =  num1;
   num1 = num2;
   num2 = temp;

}
void swap_ptr ( int * ptr1, int *ptr2 )
{
   int temp;
   temp = *ptr1;
   *ptr1 = *ptr2;
   *ptr2 = temp;

}


void swap_ref ( int &num1, int &num2)
{
   int temp;
   temp =  num1;
   num1 = num2;
   num2 = temp;

}
int main()
{
   int n1;
   int n2;
   scanf("%d %d", &n1, &n2);
   printf("B4 %d %d\n", n1, n2);
   swap_val( n1, n2);
   printf("VAL %d %d\n", n1, n2);
   swap_ptr ( &n1, &n2);
   printf("POINTER %d %d\n", n1, n2);
   swap_ref( n1, n2);
   printf("REF %d %d\n", n1, n2);



   return EXIT_SUCCESS;
}
