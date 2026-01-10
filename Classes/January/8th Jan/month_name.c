#include<stdio.h>
#include<stdlib.h>
int main()
{
    int month_num;
    scanf("%d", &month_num);
    switch ( month_num )
    {
       case 1 : printf("January\n\n\n"); break;
       case 2 : printf("February\n\n\n"); break;
       case 3 : printf("March\n\n\n"); break;
       case 4 : printf("April\n\n\n"); break;
       case 5 : printf("May\n\n\n"); break;
       case 6 : printf("June\n\n\n"); break;
       case 7 : printf("July\n\n\n"); break;
       case 8 : printf("August\n\n\n"); break;
       case 9 : printf("September\n\n\n"); break;
       case 10 : printf("October\n\n\n"); break;
       case 11 : printf("November\n\n\n"); break;
       case 12 : printf("December\n\n\n"); break;



    }



    return EXIT_SUCCESS;
}
