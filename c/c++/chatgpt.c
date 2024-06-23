#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

void printLL(struct node *n) {
    while (n != NULL) {
        printf("%d ", n->data);
        n = n->next;
    }
    printf("\n");
}

int main() {
    printf("Enter the number of values to enter: ");
    int n;
    scanf("%d", &n);

    struct node *LL[n];

    // Initialize nodes and set next pointers
    LL[0] = (struct node *)malloc(sizeof(struct node));
    // Set next pointers correctly
    for (int i = 0; i < n; i++) {
        if(i<n-1){
            LL[i+1] = (struct node *)malloc(sizeof(struct node));
            LL[i]->next = LL[i + 1];
        }else{
            LL[n - 1]->next = NULL;
        }
    }

    // Set the next of the last node to NULL


    // Input data for each node
    for (int i = 0; i < n; i++) {
        printf("Enter the data for node %d: ", i + 1);
        scanf("%d", &LL[i]->data);
    }

    // Print the linked list
    printLL(LL[0]);

    // Free allocated memory
    for (int i = 0; i < n; i++) {
        free(LL[i]);
    }

    return 0;
}