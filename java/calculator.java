import java.util.Scanner;
public class calculator{
    static float add(float a, float b){
        return a+b;
    }static float subtract(float a, float b){
        return a-b;
    }static float multiply(float a, float b){
        return a*b;
    }static float divide(float a, float b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("~~~~~]~~~~~~~~~~~~~~~~~~~~~\n\tCalculator\n~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
            int n = sc.nextInt();
            float ans=0,a=0,b=0;
            switch(n){
                case 1:
                    System.out.println("Enter the first number:");
                    a = sc.nextInt();
                    System.out.println("Enter the second number");
                    b = sc.nextInt();
                    ans = add(a,b);
                    System.out.println("The answer is: "+ ans); 
                    break;
                case 2:
                    System.out.println("Enter the first number:");
                    a = sc.nextInt();
                    System.out.println("Enter the second number");
                    b = sc.nextInt();
                    ans = subtract(a,b);
                    System.out.println("The answer is: "+ ans); 
                    break;
                case 3:
                    System.out.println("Enter the first number:");
                    a = sc.nextInt();
                    System.out.println("Enter the second number");
                    b = sc.nextInt(); 
                    ans = multiply(a,b);
                    System.out.println("The answer is: "+ ans); 
                    break;
                case 4:
                    System.out.println("Enter the first number:");
                    a = sc.nextInt();
                    System.out.println("Enter the second number");
                    b = sc.nextInt();
                    ans = divide(a,b);
                    System.out.println("The answer is: "+ ans); 
                    break;
                case 5:
                    System.out.println("Thank you.");
                    flag=false;
                    break;
                default:
                    System.out.println("Print a number between 1&4.");
            }
             
        }
        sc.close();
    }
}