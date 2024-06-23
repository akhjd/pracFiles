import java.util.*;
abstract class employee{
    private int ID;
    private String name;
    private String desig;
    private double basicsal;
    double total, hra, da, ta, agp;
    abstract void computeSalary();
    void getData(int ID, String name, String desig, double basicsal){
        this.ID=ID;
        this.name=name;
        this.desig=desig;
        this.basicsal=basicsal;
        hra=basicsal*0.1;
        da=basicsal*0.05;
        ta=basicsal*0.1;
        agp=basicsal*0.2;
    }
    double getBasic(){return basicsal;}
    void putData(char type){System.out.printf("%c\n%d\n%s\n%s\n%.0f\n%.0f",type, ID, name, desig, basicsal, total);}
    employee(){
        ID=0;
        basicsal=0;
        total=0;
    }
}
class projMan extends employee{void computeSalary(){total=getBasic()+hra+da+agp;}}
class sysEng extends employee{void computeSalary(){total=getBasic()+ta;}}
class techAssn extends employee{void computeSalary(){total=getBasic();}}
public class pat2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char type=sc.next().charAt(0);
        int ID=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        String desig=sc.nextLine();
        double basicsal=sc.nextDouble();
        projMan projM = new projMan();
        sysEng sysE = new sysEng();
        techAssn techA = new techAssn();
        if(basicsal<0){
            System.out.println("Invalid Basic");
        }else{
            if(type=='P'){
                projM.getData(ID, name, desig, basicsal);
                projM.computeSalary();
                projM.putData(type);
            }else if(type=='S'){
                sysE.getData(ID, name, desig, basicsal);
                sysE.computeSalary();
                sysE.putData(type);
            }else if(type=='T'){
                techA.getData(ID, name, desig, basicsal);
                techA.computeSalary();
                techA.putData(type);
            }
        }
        sc.close();
    }
}