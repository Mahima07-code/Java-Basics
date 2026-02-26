import java.util.Scanner;

public class MultiplyMatrix {

    static Scanner s1 = new Scanner(System.in);


    public static void inputMatrix(int x[][], int r, int c){
        
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                x[i][j] = s1.nextInt();
            }
        }
    }

    public static void showMatrix(int x[][], int r, int c){
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                System.out.print(x[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void multiplyMatrix(int x[][], int y[][], int z[][],int r1, int c1, int r2, int c2){
        int sum =0;
        if(c1==r2){
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k=0; k<c1; k++){
                        sum+= x[i][k] * y[k][j];
                    }
                    z[i][j] = sum;
                    sum =0;
                }
                
            }

        }
        else
            System.out.println("multiplication can't be performed");
    }

    public static void main(String []args){

        System.out.println("Enter the row size");
        int r1=s1.nextInt();

        System.out.println("Enter the column size");
        int c1= s1.nextInt();
        
        System.out.println("Enter the elements of first matrix :");
        int arr1[][] = new int[r1][c1];
        inputMatrix(arr1, r1, c1);
        

        System.out.println("Enter the row size");
        int r2=s1.nextInt();

        System.out.println("Enter the column size");
        int c2= s1.nextInt();

        System.out.println("Enter the elements of second matrix:");
        int arr2[][] = new int[r2][c2];
        
        inputMatrix(arr2, r2, c2);



        int arr3[][] = new int[r1][c2];


        multiplyMatrix(arr1, arr2,arr3, r1, c1, r2, c2);

        showMatrix(arr1, r1, c1);
        showMatrix(arr2, r2, c2);
        showMatrix(arr3, r1, c2);



    }
    
}
