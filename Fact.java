import java.util.*;

public class Fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = sc.nextInt();
        int fact=1;
        // for(int i=1; i<=num; i++){
        //     fact = fact*i;
        // }
        int i=1;
        while( i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial is" + " "+fact);
       
        sc.close();

        }
    
}
