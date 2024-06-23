import java.util.Scanner;
class tnerc2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
        int z=0;
        boolean y=true;
        while(y){
            z+=1;
            System.out.println("Consumer "+z);
            System.out.println("Enter Name:");
            String name= sc.next();
            System.out.println("Enter ID:");
            int id=sc.nextInt();
            System.out.println("Enter Previous Units:");
            int bu=sc.nextInt();
            System.out.println("Enter Present Units:");
            int nu=sc.nextInt();
            int cu=bu-nu;
            float cost=0,test;
            boolean a=false;
            if(cu<=500){
                test =cu;
                while(a==false){
                    if(test>=401){
                        cost+= 6*(test-400);
                        test= 400;
                    }else if(201<=test){
                        cost+= 4.5*(test-200);
                        test=200;
                    }else if(101<=test){
                        cost+=2.25*(test-100);
                        test=100;
                    }else if(test<=100){
                        a=true;
                    }
                }
            }else if(500<cu){
                test =cu;
                while(a==false){
                    if(test>=1001){
                        cost+= 11*(test-1000);
                        test= 1000;
                    }else if(801<=test){
                        cost+= 10*(test-800);
                        test=800;
                    }else if(601<=test){
                        cost+=9*(test-600);
                        test=600;
                    }else if(501<=test){
                        cost+=8*(test-500);
                        test=500;
                    }else if(401<=test){
                        cost+=6*(test-400);
                        test=400;
                    }else if(101<=test){
                        cost+=4.5*(test-100);
                        test=100;
                    }else if(test<=100){
                        a=true;
                    }
                }
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tTN Electricity Bill");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Consumer:"+z);
            System.out.println("Consumer Name:"+name);
            System.out.println("Consumer no.:"+id);
            System.out.println("Previous Units:"+bu);
            System.out.println("Present Units:"+nu);
            System.out.println("Consumed Units:"+cu);
            System.out.println("Total Amount:"+cost);
            System.out.println("End code?(true/false)");
            boolean x = sc.nextBoolean();
            if(x==true){
                y=false;
            }else{
                continue;
            }
        }
        sc.close();
	}
}