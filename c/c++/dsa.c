#include <stdio.h>
#include <stdlib.h>
struct node{
    int key;
    int value;
    struct node *next;
};
int main(){
    struct node *head=(struct node *)malloc(sizeof(struct node));
    head->key = 10;
    head->value=10;
    printf("%d %d", head->key, head->value);
}