import java.util.*;
class QuadraticEquation{
    static Scanner sc = new Scanner(System.in);
    double getA(){
        double a = sc.nextDouble();
        return a;
    }double getB(){
        double b = sc.nextDouble();
        return b;
    }double getC(){
        double c = sc.nextDouble();
        return c;
    }double getDiscriminant(double a, double b, double c){
        double discriminant =(b*b)-4*a*c;
        return discriminant;
    }double getRoot1(double a, double b, double c){
        double r1 = ((-b) + Math.pow(getDiscriminant(a,b,c),0.5))/(2*a);
        return r1;
    }double getRoot2(double a, double b, double c){
        double r2 = ((-b) - Math.pow(getDiscriminant(a,b,c),0.5))/(2*a);
        return r2;
    }
    QuadraticEquation(){
        double a= getA();
        double b= getB();
        double c= getC();
        if(getDiscriminant(a,b,c)>0){
            System.out.println(getRoot1(a,b,c));
            System.out.println(getRoot2(a,b,c));
        }else if(getDiscriminant(a,b,c)==0){
            System.out.println(getRoot1(a,b,c));
        }else{
            System.out.println("No Roots");
        }
    }
}
public class yo{
    public static void main(String[] args){
        QuadraticEquation qe = new QuadraticEquation();
        qe.getRoot1(0, 0, 0);
        //ignore the 40th line(the one right above this one)
    }  
}