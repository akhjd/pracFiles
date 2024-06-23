import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int fs=0,ccount=0,Ccount=0;
        for(int i =0; i<input.length();i++){
            if(input.charAt(i)=='.'){
                fs++;
            }else if(input.charAt(i)=='c'){
                ccount++;
            }else if(input.charAt(i)=='C'){
                Ccount++;
            }
        }
        System.out.println("Number of sentences are: "+ fs + ", Number of 'c' are: "+ccount+", Number of 'C' are: "+Ccount);
        sc.close();
    }
}
