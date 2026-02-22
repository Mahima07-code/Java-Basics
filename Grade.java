import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage");
        double per = sc.nextDouble();
        if(per>=90)
            System.out.println("Grade A");
        else if(per>=70)
            System.out.println("Grade B");
        else if(per>=30)
            System.out.println("Grade C");
        else 
            System.out.println("FAIL");

        sc.close();
    }    
}




// MAIN MENU
// 1. Greater in two no
// 2. Swapint of two no
// 3. Pos/Neg/Zero
// 4. Table of no
// 5. Exit
