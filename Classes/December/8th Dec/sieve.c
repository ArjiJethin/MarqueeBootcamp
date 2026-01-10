// array of 'n' elements
// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19........
// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19..
// 0 or 1
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define PRIME 0
#define COMPOSITE 1
#define NEITHER 2
int main()
{

    int noe;
    scanf("%d", &noe);
    // int arr [ noe ]; // VLA
    char *arr;
    arr = (char *)malloc(noe * sizeof(char));
    int arr_ind;
    for (arr_ind = 0; arr_ind < noe; arr_ind += 1)
        arr[arr_ind] = PRIME;

    arr[0] = NEITHER;
    arr[1] = NEITHER;
    int multiple;
    clock_t start = clock();
    for (multiple = 4; multiple < noe; multiple += 2)
        arr[multiple] = COMPOSITE;
    int prime;
    int inc;
    int compositeCtr;
    compositeCtr = noe / 2;
    for (prime = 3; prime * prime < noe; prime += 2)
    {
        if (arr[prime] == COMPOSITE)
            continue;
        inc = prime << 1;
        for (multiple = prime * prime; multiple < noe; multiple += inc)
        {
            if (arr[multiple] == PRIME)
            {
                arr[multiple] = COMPOSITE;
                compositeCtr += 1;
            }
        }
    }
    int pctr;
    pctr = noe - compositeCtr;
    /*
    for ( arr_ind = 0; arr_ind < noe; arr_ind += 1)
       if ( arr [ arr_ind ] == PRIME )
           pctr+=1;*/
    clock_t stop = clock();
    double duration = ((double)(stop - start)) / CLOCKS_PER_SEC;
    printf("In the range %d to %d , we have %d primes", 1, noe, pctr);
    printf("\nDuration = %.3f\n", duration);
}
