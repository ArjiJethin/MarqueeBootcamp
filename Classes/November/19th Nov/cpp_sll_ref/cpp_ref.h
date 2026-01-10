

#ifndef _SLL_REF_CPP
#define _SLL_REF_CPP
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
/*
||=== Build: Debug in sll_cpp_ref (compiler: GNU GCC Compiler) ===|
C:\WYAAT\DSU\Bootcamp 1\19112025\sll_cpp_ref\sll_cpp_ref.h|22|error: expected ';', ',' or ')' before '&' token|
||=== Build finished: 1 error(s), 0 warning(s) (0 minute(s), 0 second(s)) ===|

*/
SLL makeList(); // malloc.h
void add( SLL& popo, int , int );
void show(SLL );
int count(SLL );
int print_ith(SLL , int iter);
#endif // _SLL_REF_CPP


