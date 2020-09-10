#include <stdio.h>

// abc\0
// 012
// a b c


int main(void) {
  int i;
  char a[21];
  scanf("%s", &a);
  for(i=0; i<21; i++) {
    if(a[i] == '\0') break;
    printf("\'%c\'\n", a[i]);
  }
  return 0;
}
