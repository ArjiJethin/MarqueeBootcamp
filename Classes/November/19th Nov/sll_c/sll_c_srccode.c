#include<malloc.h>
#include"sll_c.h"
#include<stdio.h>
/*sizeof ( char )
char ch;
sizeof ch

unsigned val > signed val

unsigned val > unsigned val
               -1
                11111111111111

if ( sizeof(int) >-1)
    pf("WOW");
else
    pf("Oh !!! Oh!!!!!");*/
SLL makeList()
{
    SLL *newList  = (SLL *) malloc(sizeof(SLL));
    newList->first = NULL;
    newList->lastt =  NULL;
    newList->non = 0;
    return *newList;
}
void add( SLL * sllPtr, int factor, int partner)
{
    SLLNODE_PTR nn = (SLLNODE_PTR )malloc(sizeof(SLLNODE));
    nn-> ff = factor;
    nn-> jf = partner;
    nn->next = NULL;
    if ( sllPtr->non == 0 )
    {
        sllPtr->first = nn;
        sllPtr->lastt = nn;
    }
    else{
        sllPtr->lastt->next = nn;
        sllPtr->lastt = nn;
    }
    sllPtr->non++;
}
void show(SLL list )
{
    SLLNODE_PTR tptr; // traverse ptr
    for( tptr = list.first ; tptr != NULL; tptr = tptr->next )
    {
        printf("%d\t%d\n", tptr->ff, tptr->jf);
           }
           printf("\n");
}
int count(SLL list)
{
    return list.non;
}
int print_ith(SLL, int iter)
{

}




