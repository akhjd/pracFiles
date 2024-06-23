import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class numbertriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> pas1=new ArrayList<Integer>();
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                if(i<=2||j==1||j==i){
                    pas1.add(1);
                }
                else{
                    int z = pas1.size();
                    pas1.add(pas1.get(z-i)+pas1.get(z-i+1));
                }
            }
        }
        int y=0;
        String fin =  "";
        int z=n;
        for(int k=1;k<n+1;k++){
            
            for(int l=z;l>0;l--){
                fin+=" ";
                
            }
            for(int m=1;m<k;m++){
                fin+=String.valueOf(pas1.get(y));
                fin+=" ";
                y++;
            }
            z--;
            fin+="\n";
        }
        System.out.println(fin);
        sc.close();
    }
}