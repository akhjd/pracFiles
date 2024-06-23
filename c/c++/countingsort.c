#include <stdio.h>
int main(){
    int arr[]={3, 0, 7, 8, 3, 2, 9, 0, 8, 0, 2, 7, 0, 7, 4, 8, 9, 7, 9, 3, 7, 6, 3, 3, 9, 0, 10, 4, 10, 10};
    int max=0,size=sizeof(arr)/sizeof(arr[0]);
    int output[size];
    for(int i=0;i<size;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        output[i]=0;
    }
    int cArr[max+1];
    for(int i=0;i<max+1;i++){
        cArr[i]=0;
    }
    for(int i=0;i<max+1;i++){
        for(int j=0;j<size;j++){
            if(i==arr[j]){
                cArr[i]++;
            }
        }
    }
    int n=0;
    for(int i=0; i<max+1;i++){
        for(int j=n;j<n+cArr[i];j++){
            output[j]=i;
        }
        n+=cArr[i];
    }
    for(int i=0;i<max+1;i++){
        printf("%d ", cArr[i]);
    }
    printf("\n\n");
    for(int i=0;i<size;i++){
        printf("%d ", output[i]);
    }
}