import java.util.Scanner;

public class SumMatrix {
    static Scanner s1= new Scanner(System.in);

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

    public static void sumMatrix(int x[][], int y[][],int z[][], int r, int c){
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                z[i][j] = x[i][j] + y[i][j];
            }
        }

    }

    
    public static void main(String[] args) {
        
        System.out.println("Enter the row size");
        int row =s1.nextInt();

        System.out.println("Enter the column size");
        int col= s1.nextInt();
        
        System.out.println("Enter the elements of first matrix :");
        int arr1[][] = new int[row][col];
        inputMatrix(arr1, row, col);
        
        System.out.println("Enter the elements of second matrix:");
        int arr2[][] = new int[row][col];
        inputMatrix(arr2, row, col);

        int arr3[][] = new int[row][col];


        System.out.println("The given matrix is:");
        showMatrix(arr1, row, col);
        showMatrix(arr2, row, col);

        sumMatrix(arr1, arr2, arr3, row, col);  

        showMatrix(arr3, row, col);



    }
}
