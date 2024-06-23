import java.util.*;
public class wages {
    static int wageCalc(int hours){
        int wage =0;
        boolean flag = true;
        while(flag){
            if(hours>13){
                wage += (hours -13)*250;
                hours =13;
            }else if(hours>11){
                wage +=(hours-11)*200;
                hours=11;
            }else if(hours>8){
                wage += (hours-8)*100;
                hours=8;
            }else{
                wage+=200;
                flag=false;
            }
        }
        return wage;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many hours:");
        int hours = sc.nextInt();
        System.out.println("wage is: "+ wageCalc(hours));
        sc.close();
    }
    
}
