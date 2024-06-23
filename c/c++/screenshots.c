#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
struct node{
    int data;
    struct node *next;
};
struct dNode{
    int data;
    struct dNode *next;
    struct dNode *prev;
};
void printLL(struct node *n){
    printf("%d ", n->data);
    if(n->next!=NULL){
        printLL(n->next);
    }
}
void printDLL(struct dNode *n){
    printf("%d ", n->data);
    if(n->next!=NULL){
        printDLL(n->next);
    }
}
void revPrinDLL(struct dNode *n){
    printf("%d ", n->data);
    if(n->prev!=NULL){
        revPrinDLL(n->prev);
    }
}
void insertNode(struct node *n, int dat){
    struct node *temp;
    temp=(struct node *)malloc(sizeof(struct node *));
    temp->data=dat;
    temp->next=n->next;
    n->next=temp;
}
void singlyExec(){
    printf("Enter the number of values to enter: ");
    int n;
    scanf("%d", &n);
    struct node *LL[n];
    LL[0] = (struct node *)malloc(sizeof(struct node));
    for (int i = 0; i < n; i++) {
        if(i<n-1){
            LL[i+1] = (struct node *)malloc(sizeof(struct node));
            LL[i]->next = LL[i + 1];
        }else{
            LL[n - 1]->next = NULL;
        }
    }
    for(int i=0;i<n;i++){
        printf("Enter the data: ");
        scanf("%d", &LL[i]->data);
    }
    printLL(LL[0]);
    printf("\n");
    insertNode(LL[3], 7);
    insertNode(LL[3], 8);
    printf("%d %d", LL[4]->data, LL[3]->data);
    printf("\n");
    printLL(LL[0]);
}
void doublyExec(){
    printf("Enter the number of values to enter: ");
    int n;
    scanf("%d", &n);
    struct dNode *DLL[n];
    for(int i=0;i<n;i++){
        DLL[i]=(struct dNode *)malloc(sizeof(struct dNode));
    }
    for(int i=0;i<n-1;i++){
        if(i!=0){
            DLL[i]->prev=DLL[i-1];
        }
        DLL[i]->next=DLL[i+1];
    }
    DLL[0]->prev=NULL;
    DLL[n-1]->prev=DLL[n-2];
    DLL[n-1]->next=NULL;
    for(int i=0;i<n;i++){
        printf("Enter the data: ");
        scanf("%d", &DLL[i]->data);
    }
    printDLL(DLL[0]);
    printf("\n");
    revPrinDLL(DLL[n-1]);
}
int main(){
    int a=1;
    while(a){
        printf("\nEnter the code you want to run:\n1.Single Linked List\n2.Double Linked List\n3.Exit\n");
        int n;
        scanf("%d", &n);
        switch (n)
        {
        case 1:
            singlyExec();
            break;
        case 2:
            doublyExec();
            break;
        case 3:
            printf("Exiting...");
            a=0;
            break;
        default:
            printf("Enter a number 1 through 8");
            break;
        }
    }
    return 0;
}