import java.util.Scanner;
public class evenodd1{
    public static void main(String[] args) {
        System.out.println("enter the number of values");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),digit =0;
        if (n < 0) {
            System.out.println("Invalid Input");
        }
        else{
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++){
                System.out.println("enter no.");
                int num = sc.nextInt();
                int revnum=0,dnum=num;
                for(int j=0;j<String.valueOf(num).length(); j++){
                    revnum = revnum*10 + dnum%10;
                    dnum /=10;
                }
                while (revnum > 0) {
                    digit = revnum % 10;
                    if (digit % 2 == 0) {
                        even = even * 10 + digit;
                    }else{
                        odd = odd * 10 + digit;
                    }
                    revnum /= 10;
                }
            }
            System.out.println("First Number:" + odd);
            System.out.println("Second Number:" + even);    
        }
        sc.close();
    }
}
//234 67 45 89 11