import java.util.*;
public class point {
    public static boolean leftOfTheLine(double x0,double y0,double x1,double y1,double x2,double y2){
        if((x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) > 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean onTheSameLine(double x0,double y0,double x1,double y1,double x2,double y2){
        if((x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) == 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean rightOfTheLine(double x0,double y0,double x1,double y1,double x2,double y2){
        if((x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) < 0){
            return true;
        }else{
            return false;
        }
    }
    public static void putData(double x0,double y0,double x1,double y1,double x2,double y2){
        if(leftOfTheLine(x0,y0,x1,y1,x2,y2)==true){
            System.out.println("("+x2+", "+y2+") " +"is on the left side of the line"+"("+x0+", "+y0+") to ("+x1+", "+y1+") ");
        }else if(onTheSameLine(x0,y0,x1,y1,x2,y2)==true){
            System.out.println("("+x2+", "+y2+") " +"is on the same line from "+"("+x0+", "+y0+") to ("+x1+", "+y1+") ");
        }else if(rightOfTheLine(x0,y0,x1,y1,x2,y2)==true){
            System.out.println("("+x2+", "+y2+") " +"p2 is on the right side of the line"+"("+x0+", "+y0+") to ("+x1+", "+y1+") ");
        }
    }
    public static boolean getData(double x0,double y0,double x1,double y1,double x2,double y2){
        putData(x0, y0, x1, y1, x2, y2);
        return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double x0=sc.nextDouble();
        double y0=sc.nextDouble();
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        getData(x0,y0,x1,y1,x2,y2);
        sc.close();
    }    
}
