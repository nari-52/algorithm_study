#include <stdio.h>

int main(void) {
  int a, b, c;
  scanf("%d %d %d", &a, &b, &c);
  int sum = a+b+c;
  float avg = (float)sum/3;
  printf("%d\n%.1f", sum, avg);
  return 0;
}
