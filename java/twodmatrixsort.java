import java.util.*;
public class twodmatrixsort {
    static Scanner sc= new Scanner(System.in);
    public static void MySort(int a[][]){
        int temp=0,temp1=0;
        for(int z=0;z<6;z++){
            for(int i=5;i>0;i--){
                if(a[i][0]<a[i-1][0]){
                    temp=a[i][0];
                    a[i][0]=a[i-1][0];
                    a[i-1][0]=temp;
                    temp1=a[i][1];
                    a[i][1]=a[i-1][1];
                    a[i-1][1]=temp1;
                }
                if(a[i][0]==a[i-1][0]&&a[i][1]<a[i-1][1]){
                    temp=a[i][0];
                    a[i][0]=a[i-1][0];
                    a[i-1][0]=temp;
                    temp1=a[i][1];
                    a[i][1]=a[i-1][1];
                    a[i-1][1]=temp1;
                }
            }
        }
        System.out.println();
        for(int i=0;i<6;i++){
            for(int j=0;j<2;j++){
                System.out.println(a[i][j]);
            }
        }
    }
    public static void main(String[] args){
        int[][] arr = new int[6][2];
        for(int i=0;i<6;i++){
            for(int j=0; j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        MySort(arr);
    }
}
