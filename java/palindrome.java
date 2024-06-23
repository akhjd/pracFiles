import java.util.*;
public class palindrome {
    static void check(String input){
        int n =0;
        ArrayList<Character> reverse= new ArrayList<Character>();
        char temp=' '; 
        char temp1=' ';
        for(int i =input.length()-1;i>=0; i--){
            reverse.add(input.charAt(i));
        }
        for(int i =0; i<input.length(); i++){
            if(reverse.get(i)==input.charAt(i)){
                continue;
            }else{
                temp =  input.charAt(i);
                temp1 = reverse.get(i);
                n++;
            }
        }
        if(n>2){
            System.out.println("Not palindrome");
        }else if(n>0){
            System.out.println("replacing "+ temp + " with "+ temp1 +" gives palindrome");
        }else{
            System.out.println("is palindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String input = sc.next();
        check(input);
        sc.close();
    }
}
