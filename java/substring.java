import java.util.*;
public class substring {
    public static void check(String input, String input2){
        int len = input2.length(),n=0;
        outerLoop:{
            for(int i=0; i<input.length();i++){
                for(int j=0; j<input2.length();j++){
                    if((i+j+1)>input.length()){
                        break outerLoop;
                    }else if(n==len){
                        break outerLoop;
                    }else if(input.charAt(i+j)==input2.charAt(j)){
                        n++;
                    }
                }
                if(n!=len){
                    n=0;
                }
            }
        }
        if(n==len){
            System.out.println("substring");
        }else{
            System.out.println("not");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String input2 = sc.next();
        check(input, input2);
        sc.close();
    }
}
