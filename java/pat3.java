import java.util.*;
class circle{
    Scanner sc = new Scanner(System.in);
    private double radius;
    private double area;
    private void putData(){
        System.out.printf("%.2f", area);
    }
    private void computeArea(){
        area=radius*radius*Math.PI;
    }
    void setData(){
        radius=sc.nextDouble();
        if(radius<0){
            System.out.println("invalid radius");
        }else{
            computeArea();
            putData();
        }
    }
}
class rectangle extends circle{
    private double length;
    private double width;
    private double area;
    private String st;
    private void putData(){
        System.out.printf("%.2f", area);
    }
    private void computeArea(){
        area=length*width;
    }
    void getData(){
        st=sc.next();
        if(st.charAt(0)=='C'){
            setData();
        }else if(st.charAt(0)=='R'){
            length=sc.nextDouble();
            width=sc.nextDouble();
            if(length<0&&width<0){
                System.out.println("invalid length and width");
            }else if(length<0){
                System.out.println("invalid length");
            }else if(width< 0){
                System.out.println("invalid width");
            }else{
                computeArea();
                putData();
            }
        }
    }
}
public class pat3 {
    public static void main(String[] args){
        rectangle rec=new rectangle();
        rec.getData();
    }
}
