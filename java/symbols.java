import java.util.Scanner;
public class symbols{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows no:\n");
        int row=sc.nextInt();
        System.out.print("Enter columns no:\n");
        int column=sc.nextInt();
        if(column==row){
            for (int i=0;i<column;i++){
                for(int j=0;j<row;j++){
                    if(j==i){
                        System.out.printf("*");
                    }
                    else{
                        if(i%2==0){
                            System.out.printf("#");
                        }
                        else{
                            System.out.printf("$");
                        }
                    }
                }
             System.out.println(" ");
            }
        }
        if (column!=row){
            System.out.printf("Rows and Columns are not Equal");
        }
        sc.close();
    }
}
