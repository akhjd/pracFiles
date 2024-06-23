import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of variables: ");
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter the values: ");
        for(int i=0; i <n; i++){
            int input = sc.nextInt();
            int flag=0;
            for(int j=0; j<numbers.size();j++){
                if(input==numbers.get(j)){
                    flag+=1;
                }
            }
            if(flag<=0){
                numbers.add(input);
            }
        }
        System.out.println(numbers);
        sc.close();
    }
}