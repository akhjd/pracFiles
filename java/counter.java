import java.util.*;
public class counter {
    static int[][] finalize(int arr[][],int r,int c){
        int rows=0,column=0,n=0,rt=0;
        for(int k=0;k<10;k++){
            for(int i=0;i<r;i++){
                for(int j = 0; j<c;j++){
                    n=arr[i][j]/10;
                    if(n==k){
                        rt+=1;
                        if(rt>rows){
                            rows=rt;
                        }if(n>column){
                            column=n+1;
                        }
                    }
                }
            }
            rt=0;
        }
        int matrix[][]=new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0; j<column;j++){
                matrix[i][j]=0;
            }
        }
        int nt=0;
        for(int k=0;k<column;k++){
            for(int i=0;i<r;i++){
                for(int j = 0; j<c;j++){
                    if(arr[i][j]/10==k){
                        matrix[nt][k]=arr[i][j];
                        nt++;
                    }
                }
            }
            nt=0;
        }
        return matrix;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the rows and columns respectively");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j = 0; j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int finalMatrix[][]=finalize(arr, r, c);
        for(int i=0;i<finalMatrix.length;i++){
            for(int j=0;j<finalMatrix[0].length;j++){
                System.out.print(finalMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}