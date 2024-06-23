import java.util.*;
public class pentogon {
    public static double area(double side){
        double ar=(5 * Math.pow(side, 2)*Math.tan(3*3.14*0.1))/(4);
        return ar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble(),ar=0;
        if(side<0){
            System.out.println("Invalid Input");
        }else{
            ar = area(side);
        }
        System.out.printf("%.3f", ar);
        sc.close();
    }
}
