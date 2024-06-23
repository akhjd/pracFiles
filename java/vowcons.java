import java.util.*;
public class vowcons {
    public static void check(String input){
        char[] charinp = input.toCharArray();
        int vow=0, cons= 0;
        for(int i =0; i<input.length();i++){
            if(charinp[i] == 'a'||charinp[i] == 'A'||charinp[i] == 'e'||charinp[i] == 'E'||charinp[i] == 'i'||charinp[i] == 'I'||charinp[i] == 'o'||charinp[i] == 'O'||charinp[i] == 'u'||charinp[i] == 'U'){
                vow++;
            }else{
                cons++;
            }
        }
        System.out.printf(vow + " "+  cons);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        check(input);
        sc.close();
    }
}
