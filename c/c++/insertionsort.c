#include <stdio.h>
void printArr(int arr[], int size){
    for(int i=0; i< size; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
}
void shift(int arr[], int n,int m){
    int end = arr[m];
    for(int i=m;i>n;i--){
        arr[i]=arr[i-1];
    }
    arr[n]=end;
}
int main(){
    int arr[]={1,4,3,2,5,6,54,23};
    int size= sizeof(arr)/sizeof(arr[0]);
    for(int i=0; i<size;i++){
        for(int j=i;j<size; j++){
            if(arr[i]>arr[j]){
            shift(arr, i, j);
            printArr(arr,size);
            }
        }
    }
    printf("\n");
    printArr(arr,size);
}