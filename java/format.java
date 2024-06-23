import java.util.*;
public class format{
    static String forma(int n, int w, int ss){
        char[] fin= new char[w];
        for(int j =0; j<w-ss; j++){
            fin[j]='0';
        }
        int z=0;
        for(int j=w-ss; j<w;j++){
            fin[j]=String.valueOf(n).charAt(z);
            z++;
        }
        String finl = new String(fin);
        return finl;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int ss=String.valueOf(n).length();
        if(ss>w){
            System.out.println(n);
        }else{
            System.out.println(forma(n,w,ss));
        }
        sc.close();
    }
}