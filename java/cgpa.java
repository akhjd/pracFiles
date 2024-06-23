import java.util.Scanner;
public class cgpa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CGPA: ");
        float cgpa = sc.nextFloat();
        if(cgpa>9.0){
            System.out.println("Grade is S");
        }else if(cgpa>7.5){
            System.out.println("Grade is A");
        }else if(cgpa>6.0){
            System.out.println("Grade is B");
        }else if(cgpa>5.0){
            System.out.println("Grade is C");
        }else if(cgpa>4.0){
            System.out.println("Grade is D");
        }else if(cgpa>0.0){
            System.out.println("Grade is F");
        }
        sc.close();
    }
}
