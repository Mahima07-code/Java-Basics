import java.util.*;


public class SumOfDigit {
    public static int sod1(int a){
        int sum =0; 
        while(a>0){
            int d = a%10;
            sum +=d;
            a = a/10;
        }
        
    return sum;
}
    public static int sod2(){
        int sum =0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        while(a>0){
            int d = a%10;
            sum +=d;
            a = a/10;
        }
        
    return sum;
}
    public static void sod3(){
        int sum =0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        while(a>0){
            int d = a%10;
            sum +=d;
            a = a/10;
        }
        System.out.println("The sum of digits is"+ sum);
}

public static void sod4(int a){
        int sum =0; 
        while(a>0){
            int d = a%10;
            sum +=d;
            a = a/10;
        }
        System.out.println("The sum of digits is" +sum);
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int s1=sod1(num);
        System.out.println("The sum of digits is "+ s1);

        int s2=sod2();
        System.out.println("The sum of digits is "+ s2);

        sod3();
        sod4(num);

        sc.close();

    }

}
