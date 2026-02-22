import java.util.*;
public class Palindrome {

    public void sumNumber(int a,int b){
        int c;
        c=a+b;
        System.out.println("Sum is"+c);

    }
    public void sumNumber2(){
        Scanner s1 = new Scanner(System.in);
        int num1 = s1.nextInt();
        int num2 = s1.nextInt();

        int c;
        c=num1 + num2 ;
        System.out.println("Sum is"+c);

    }
    static int palindrome(int x){
        int rev = 0;
        while(x>0){
            int d  = x%10;
            rev = (rev*10) +d;
            x = x/10;
        }
        return rev;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to check pailndrome");
        int num = sc.nextInt();
        
        int rev = palindrome(num);
        if(rev==num)
            System.out.println("It is Palindrome");
        else 
            System.out.println("It is not a Palindrome");
        
        sc.close();
    }

}


/*
again function can be categorised into two ways
function with arguments
function without arguments

*/