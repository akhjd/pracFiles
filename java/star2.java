import java.util.Scanner;
public class star2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the pyramid size:");
        int n = s.nextInt();
        int a=n*2;
        for(int i=1; i<n*2; i+=2){
            for(int j=a-2; j>0;j-=1){
                System.out.print(" ");
            }
            a-=2;
            for(int l=0;l<i;l++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        a=4;
        for(int i=(n*2)-1; i>0; i-=2){
            for(int j=a-2; j>0;j-=1){
                System.out.print(" ");
            }
            a+=2;
            for(int l=0;l<i-2;l++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        s.close();
    }
}
