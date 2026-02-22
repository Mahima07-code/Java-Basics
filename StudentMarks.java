// Take the marks of student in 5 subjects and calculate  total marks and percentage 

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 ,sub2 ,sub3 ,sub4 ,sub5 ,total ;
        double per ;
        System.out.println("enter marks of 5 subjects");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();
        sub4 = sc.nextInt();
        sub5 = sc.nextInt();
        total = sub1+ sub2+ sub3+ sub4+ sub5;
        System.out.println("Total marks = "+total);
        per = (total*100)/500;
        System.out.println("Percentage is "+per+"%");

        sc.close(); 
    }
    
}
