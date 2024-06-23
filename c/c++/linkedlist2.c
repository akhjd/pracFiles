#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *next;
};
void printLL(struct node *n){
    printf("%d ", n->data);
    printLL(n->next);
}
void addEle(struct node *n, int a, int count){
    int dat;
    struct node *temp=(struct node *)malloc(sizeof(struct node));
    if(count!=a){
        scanf("%d", &dat);
        temp->data=dat;
        temp->next=NULL;
        n->next = temp;
        count++;
        addEle(n->next, a, count);
    }
}
void singlyexec(){
    struct node *head=(struct node *)malloc(sizeof(struct node));
    head->data=-1;
    int n;
    int count=0;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    addEle(head,n, count);
    printLL(head);
}
int main(){
    singlyexec();
}