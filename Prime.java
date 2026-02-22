import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();
        for(int i =2; i<=num/2; i++){
            if(num%i ==0){
                System.out.println("Not Prime");
                break;
            }
            else{
                System.out.println("Prime");
                break;
            }
        }
        sc.close();
    }
    
}
