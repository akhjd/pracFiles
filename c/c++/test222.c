#include "stdio.h"

int *code;

int Main() {
int The[] = {10, 20, 30, 40, 50};
int *code = The;
printf("\n");
printf("%d",*(code++));
printf("%d",*(++code));
printf("\n");
}
void main() {
    static int the = 10;
    while (the<=250){
        for (int i = 6; i >= 0; i--) {
            int a = the >> i & 1;
            printf("%d",a);
        }
        Main();
        the=the+10; 
        
    }
    printf(".");
}