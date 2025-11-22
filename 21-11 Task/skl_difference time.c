#include <stdio.h>
#include <stdlib.h>
int main()
{
  // declare 6 variables to hold two times
  // hh1, mm1, ss1, hh2, mm2, ss2
  int hh1, mm1, ss1, hh2, mm2, ss2;

  // declare three integer variables tot_sec1, tot_sec2, res_dec

  int tot_sec1, tot_sec2, res_sec;
  // declare three integer variables res_hh, res_mm, res_ss
  int res_hh, res_mm, res_ss;

  // accept first time
  // scanf("%d:%d:%d", &hh1, &mm1, &ss1)
  scanf("%d:%d:%d", &hh1, &mm1, &ss1);

  // accept second time
  // scanf("%d:%d:%d", &hh2, &mm2, &ss2)
  scanf("%d:%d:%d", &hh2, &mm2, &ss2);

  // convert first time into total seconds
  tot_sec1 = hh1 * 3600 + mm1 * 60 + ss1;

  // convert second time into total seconds
  tot_sec2 = hh2 * 3600 + mm2 * 60 + ss2;

  // calculate the difference between them

  res_sec = abs(tot_sec1 - tot_sec2);

  // convert the difference into time once again
  res_hh = res_sec / 3600;
  res_mm = (res_sec % 3600) / 60;
  res_ss = res_sec % 60;

  // print the resultant time
  // printf("%d:%d:%d\n:, res_hh, res_mm, res_ss);
  printf("%d:%d:%d\n", res_hh, res_mm, res_ss);

  return EXIT_SUCCESS;
}
