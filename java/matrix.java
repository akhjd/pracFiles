import java.util.*;
public class matrix {
    static int[][] transpose(int arr[][]){
        int transpose1[][] = new int[3][3];
        for(int i =0; i<3;i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    if(i>0){
                        transpose1[i][j]=arr[i-1][i-1];
                    }else{
                        transpose1[i][j]=arr[2][2];
                    }
                }else{
                    transpose1[i][j]=arr[j][i];
                    transpose1[j][i]=arr[i][j];
                }
            }
            System.out.println();
        }
        return transpose1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("enter the values after the listed column and row");
        for(int i =0; i<3;i++){
            System.out.println((i+1)+" column");
            for(int j=0; j<3; j++){
                System.out.println((j+1)+ " row");
                arr[i][j]=sc.nextInt();
            }
        }
        int arr1[][]=transpose(arr);
        for(int i =0; i<3;i++){
            for(int j=0; j<3; j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}