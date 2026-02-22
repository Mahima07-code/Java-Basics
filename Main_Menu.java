import java.util.*;
public class Main_Menu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k=0;
        do{
            System.out.println("Main Menu");
            System.out.println(" 1. Greater in two no\r\n" + 
                            " 2. Swapint of two no\r\n" + 
                            " 3. Pos/Neg/Zero\r\n" + 
                            " 4. Table of no\r\n" + 
                            " 5. Exit");
            System.out.println("Enter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter two number");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    if(num1>num2)
                        System.out.println( num1+"is greater");
                    else
                        System.out.println(num2+" is greater");
                
                    break;
                case 2:
                    System.out.println("Enter two number");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("before swapping num1: "+num1);
                    System.out.println("before swapping num2: "+num2);
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                    System.out.println("after swapping num1: "+num1);
                    System.out.println("after swapping num2: "+num2);
                    break;

                case 3:
                    System.out.println("Enter  number");
                    int num = sc.nextInt();
                    if(num ==0)
                        System.out.println("It is zero");
                    else if(num>0)
                    System.out.println("It is a positive number ");
                    else
                        System.out.println("It is a negative number ");

                    
                    break;
                case 4:
                    System.out.println("Enter your number");
                    num = sc.nextInt();
                    for(int i =0; i<=10; i++)
                        System.out.println(num+"*"+i+"="+num*i);
                    
                    break;
                case 5:
                    System.exit(0);
                    
            
                default:
                    System.out.println("Invalid choice");
                    
            }
        }while(k!=1);
        // if(choice==1){
        //     System.out.println("Enter two number");
        //     int num1 = sc.nextInt();
        //     int num2 = sc.nextInt();
        //     if(num1>num2)
        //         System.out.println( num1+"is greater");
        //     else
        //         System.out.println(num2+" is greater");
                
        // }
        // else if( choice==2){
        //     System.out.println("Enter two number");
        //     int num1 = sc.nextInt();
        //     int num2 = sc.nextInt();
        //     System.out.println("before swapping num1: "+num1);
        //     System.out.println("before swapping num2: "+num2);
        //     int temp = num1;
        //     num1 = num2;
        //     num2 = temp;
        //     System.out.println("after swapping num1: "+num1);
        //     System.out.println("after swapping num2: "+num2);
        // }
        // else if(choice ==3){
        //     System.out.println("Enter  number");
        //     int num = sc.nextInt();
        //     if(num ==0)
        //         System.out.println("It is zero");
        //     else if(num>0)
        //         System.out.println("It is a positive number ");
        //     else
        //         System.out.println("It is a negative number ");

        // }
        // else if(choice==4){
        //     System.out.println("Enter your number");
        //     int num = sc.nextInt();
        //     for(int i =0; i<=10; i++)
        //         System.out.println(num+"*"+i+"="+num*i);
        // }
        // else if(choice ==5)
        //     System.out.println("Exit");
        // else
        //     System.out.println("Invalid choice");

        sc.close();
    }

}