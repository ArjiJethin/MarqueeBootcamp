#include <stdio.h>
#include <stdlib.h>
#include"cpp_ref.h"
// 18 10 2005
int main()
{
    int num;
    scanf("%d", &num);
    int cff;
    SLL factList = makeList();
    for( cff =1; cff * cff < num; cff+=1 )
    {
        if ( num % cff == 0)
        {
            add( factList, cff , num / cff);

        }
    }
        if ( num % cff == 0)
        {
            add( factList, cff , -1);

        }

    show ( factList );
    printf("nof = %d", count(factList));
    return 0;
}
