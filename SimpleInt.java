// WAP that will take a number from user principle amount ,rate of interest and timeperiod form user.Calculate the simple interest.

import java.util.Scanner;
public class SimpleInt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        double rate , amt,t,si;
        
        System.out.println("Enter principal");
        p= sc.nextInt() ;
        System.out.println("Enter rate");
        rate= sc.nextDouble();
        System.out.println("Enter time");
        t= sc.nextDouble();
        
        amt = (p*rate*t)/100;
        si = amt + p;
        System.out.println("The simple interest is "+si);
        sc.close();

    }
}
