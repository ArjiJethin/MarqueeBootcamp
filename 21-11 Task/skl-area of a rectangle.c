#include <stdio.h>
#include <stdlib.h>
int main()
{
  // declare three integer variable length, breadth and area
  int length, breadth, area;

  // accept the length and breadth from the user
  printf("Enter length and breadth of the rectangle: ");
  scanf("%d %d", &length, &breadth);

  // calculate the area of the rectangle
  area = length * breadth;

  // print
  // area of the rectangle with xxx length and xxx breadth is xxx
  printf("Area of the rectangle with %d length and %d breadth is %d\n", length, breadth, area);

  return EXIT_SUCCESS;
}
