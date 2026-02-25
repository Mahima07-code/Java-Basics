import java.util.Scanner;

public class TwoDDemo {
    public static void main(String ar[]){
        Scanner s1=new Scanner(System.in);
        int x[][]=new int[3][4];
        System.out.println("Enter two d array");
        for(int i=0;i<3;i++)
            for(int j=0;j<4;j++)
                x[i][j]=s1.nextInt();

        System.out.println("Array is\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }

    }
}
