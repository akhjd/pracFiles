#include <stdio.h>
int main(){
    float a=1;
    for(int i=1;i<1000000000000000;i++){
        a+=1.0/i;
        printf("%f  %d\n", a, i);
    }
}