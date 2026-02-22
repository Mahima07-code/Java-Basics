import java.util.Scanner;

/*
returntype nameoffunction(argumenttype nameofargument){
    body of function

}

*/


public class FunDemo {
    static void calFact(int x){
        int s=1;
        for(int i=1;i<=x;i++)
            s=s*i;
        System.out.println("Factorial is"+s);
        


    }
    public static void main(String ar[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter no");
        int num=s1.nextInt();
        calFact(num);

        System.out.println("Good Day");
        System.out.println("Welcome");
        System.out.println("Enter no");
        num=s1.nextInt();
        calFact(num);

        s1.close();

    }
}
