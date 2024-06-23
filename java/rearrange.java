import java.util.*;
public class rearrange {
    static String rearrangeMethod(String input){
        ArrayList<Character> Final = new ArrayList <Character> ();
        for(int i =0; i<input.length()/2; i++){
            Final.add(input.charAt((i*2)+1));
            Final.add(input.charAt((i*2)));
        }
        char[] array = new char[Final.size()];
        for(int j =0;j<Final.size(); j++){
            array[j]=Final.get(j);
        }
        String finalString = new String(array);
        return finalString;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input1 = sc.next();
        System.out.println(rearrangeMethod(input1));
        sc.close();
    }
}
