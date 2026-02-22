import java.util.*;

public class Func {

    static void maxNo(int x, int y){
        if(x>y)
            System.out.println(x+" is greater ");
        else
            System.out.println(y+ " is greater ");

    }
    static int greaterNum(int x, int y){
        if(x>y)
            return x;
        else if(y>x)
            return y;
        else
            return -1;
        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        maxNo(a,b);
        int n=greaterNum(a, b);
        if(n==-1)
            System.out.println("both r equals");
        else
            System.out.println("Greater number is"+n);
        sc.close();
    }

    
}

/*
there can be different types of functions
1. function that do not return any value
2. function that will return some value

*/
