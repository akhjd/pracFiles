#include <stdio.h>
#include <string.h>
    struct robot{
    int direction;
    int x;
    int y;
};
int main(){
    struct robot r={0,0,0};
    char inpt;
    for(int i=0;i<6;i++){
        scanf(" %c", &inpt);
        if(r.direction==0){
            if(inpt=='F'&&r.y<5){
                r.y++;
            }
            else if(inpt=='R'){
                r.direction=1;
            }
            else if(inpt=='L'){
                r.direction=3;
            }
            else if(inpt=='D'&&r.y>0){
                r.y--;
            }
            else{
                printf("Out of bounds!");
            }
        }
        else if(r.direction==1){
            if(inpt=='F'&&r.x<5){
                r.x++;
            }
            else if(inpt=='R'){
                r.direction=2;
            }
            else if(inpt=='L'){
                r.direction=0;
            }
            else if(inpt=='D'&&r.x>0){
                r.x--;
            }
            else{
                printf("Out of bounds!");
            }
        }
        else if(r.direction==2){
            if(inpt=='F'&&r.y>0){
                r.y--;
            }
            else if(inpt=='R'){
                r.direction=3;
            }
            else if(inpt=='L'){
                r.direction=1;
            }
            else if(inpt=='D'&&r.y<5){
                r.y++;
            }
            else{
                printf("Out of bounds!");
            }
        }
        else if(r.direction==3){
            if(inpt=='F'&&r.x>0){
                r.x--;
            }
            else if(inpt=='R'){
                r.direction=0;
            }
            else if(inpt=='L'){
                r.direction=2;
            }
            else if(inpt=='D'&&r.x<5){
                r.x++;
            }
            else{
                printf("Out of bounds!");
            }
        }
    }
    char str[10];
    if (r.direction == 0)
        strcpy(str, "North");
    else if (r.direction == 1)
        strcpy(str, "East");
    else if (r.direction == 2)
        strcpy(str, "South");
    else if (r.direction == 3)
        strcpy(str, "West");

    printf("Final position: (%d,%d)\nFinal orientation: %s\n", r.x, r.y, str);
}