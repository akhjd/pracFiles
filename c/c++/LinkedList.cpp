#include <iostream>
using namespace std;
class node{
    public:
    int data;

    node* next;
};
class dNode{
    public:
    int data;
    dNode* next;
    dNode* prev;
};
void printLinkedList(node* n){
    if(n->next!=NULL){
        cout<<n->data<<" ";
        printLinkedList(n->next);
    }else if(n->next==NULL){
        cout<<n->data;
        cout<<" end of list";
    }else{
        cout<<"yolo1";
    }
}
void singlyExec(){
    cout<<"enter the number of elements in the list\n";
    int n;
    cin>>n;
    node* Node[n];
    for(int i=0;i<n;i++){
        node* Node[i]={NULL};
        Node[i]=new node();
        cout<<"enter the data to be entered in the "<<i+1<<" value: ";
        int a;
        cin>> a;
        Node[i]->data=a;
    }
    for(int i=0;i<n-1;i++){
        Node[i]->next=Node[i+1];
    }
    Node[n-1]->next=NULL;
    printLinkedList(Node[0]);
    cout<<endl;
}
void doublyExec(){
    cout<<"enter the number of elements in the list\n";
    int n;
    cin>>n;
    dNode* dNode[n];
    dNode* dNode[0]={NULL};
    dNode[0]->data=
    for()
}
int main(){
    singlyExec();
    return 0;
}