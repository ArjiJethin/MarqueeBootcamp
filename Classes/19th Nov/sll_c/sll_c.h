#ifndef _SLL_C
#define _SLL_C
typedef struct sllNode
{
    int ff; // found factor
    int jf; // jodi factor
    struct sllNode * next;

} SLLNODE;
typedef SLLNODE * SLLNODE_PTR;

typedef struct sll
{
    SLLNODE_PTR first;
    SLLNODE_PTR lastt;
    int non; // number of nodes
} SLL;
// prototypes

SLL makeList(); // malloc.h
void add( SLL *, int , int );
void show(SLL);
int count(SLL);
int print_ith(SLL, int iter);
#endif // _SLL_C


