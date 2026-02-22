// public take the roll no marks calculate total marks and percentage do this process till user say nuse rsay no more record 
// at the nd also show how many studet got 80% {
    
import java.util.Scanner;
public class main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Enter your Roll no:");
            int roll = sc.nextInt();
            System.out.println("Enter your marks:");
            int total =0;
            for(int i =0; i<5; i++){
                int subi = sc.nextInt();
                total += subi;
            }
            System.out.println("Total marks : "+total);
            double per = (total*100)/500;
            System.out.println("Percentage : "+per+"%");

            System.out.println("Do you want to continue: (Yes/No)");
            String ch = sc.next();
            if(ch.equalsIgnoreCase("no"))
                break;
        }
        sc.close();
    }

}
