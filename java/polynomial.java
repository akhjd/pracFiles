import java.util.*;
public class polynomial {
    static Scanner sc = new Scanner(System.in);
    static int sum(int n, int arr[], int x){
        int sum=0;
        for(int i =0; i <n+1; i++){
            sum+=arr[i]*Math.pow(x,n-i);
        }
        return sum;
    }
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr = new int[n+1];
        if(n<0){
            System.out.println("Invalid Input");
        }else{
            
            for(int i =0; i<n+1; i++){
                arr[i]=sc.nextInt();
            }
            int x = sc.nextInt();
            System.out.println(sum(n,arr,x));
        }
    }
}
