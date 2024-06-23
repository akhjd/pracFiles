#include <stdio.h>
void printArr(int arr[], int size){
    for(int i=0;i<size;i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
}
void merge(int arr1[], int arr2[],int size1,int size2){
    int outArr[size1+size2];
    int index1=0,index2=0;
    for(int i=0;i<size1+size2;i++){
        if(arr1[index1]<arr2[index2]){
            outArr[i]=arr1[index1];
            index1++;
        }else if(arr1[index1]>arr2[index2]){
            
            outArr[i]=arr2[index2];
            index2++;
        }
    }if(size1>size2){
        outArr[size1+size2-1]=arr1[index1];
    }else{
        outArr[size1+size2-1]=arr2[index2];
    }
    printArr(outArr, size1+size2);
}
int main(){
    int arr[]={0,2,4,6,8,10};
    int arr2[]={1,3,5,7,9};
    int size1=sizeof(arr)/sizeof(arr[0]);
    int size2=sizeof(arr2)/sizeof(arr2[0]);
    merge(arr,arr2,size1,size2);
    
}