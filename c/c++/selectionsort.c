#include <stdio.h>
int main(){
    int arr[]={9,3,6,2,5,4,1,7,10,8};
    int pos=0, temp=0, small=1, size=sizeof(arr)/4;
    for(int i=0;i<size; i++){
        printf("%d ", arr[i]);
    }
    printf("\n\n");
    for(int i=0; i<size-1; i++){
        small=arr[i];
        for(int j=i; j<size; j++){
            if(arr[j]<=small){
                small=arr[j];
                pos=j;
            }
        }
        temp=arr[i];
        arr[i]=small;
        arr[pos]=temp;
        for(int i=0;i<size; i++){
            printf("%d ", arr[i]);
        }
        printf("\n");
    }
    printf("\n");
    for(int i=0;i<size; i++){
        printf("%d ", arr[i]);
    }
}