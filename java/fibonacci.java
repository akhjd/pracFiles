import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of outputs required:");
        int n = s.nextInt();
        System.out.println();
        int a=0,b=0,c=1;
        for(int i = 0; i<n; i++){
            a=b;
            b=c;
            System.out.println(c);
            c=a+b;
        }
        s.close();
    }
}
