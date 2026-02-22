import java.util.Scanner;

public class add2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        int num1, num2;

        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is "+sum);
        sc.close();



    }
    
}
