import java.util.*;
public class markov {
    static Scanner sc = new Scanner(System.in);
    public static boolean isMarkovMatrix(double[][] m){
        boolean a=true;
        boolean chk=true;
        double z=0;
        while(a){
            for(int i=0;i<m.length;i++){
                z=0;
                for(int j=0;j<m.length;j++){
                    z+=m[j][i];
                }
                if(z!=1){
                    System.out.println("Not Markov matrix");
                    a=false;
                    break;
                }
            }
            if(z==1){
                System.out.println("Markov matrix");
                a=false;
                break;
            }
            
        }
        return chk;
    }
    public static void main(String[] args){
        double arr[][]={{0.15,0.875,0.375},{0.55,0.005,0.225},{0.30,0.12,0.4}};
        isMarkovMatrix(arr);
    }
}
