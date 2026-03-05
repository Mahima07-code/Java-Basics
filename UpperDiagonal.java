// QUES:-
// TO print the upper diagonal elements of the matrix.

import java.util.Scanner;
public class UpperDiagonal {

    static Scanner s1 = new Scanner(System.in);

    public static void upperDiagonal(int x[][], int r, int c){
        for(int i=0; i<=r; i++){
            for(int k =0; k<r; k++){
                if(k>=i){
                    System.out.print(x[i][k]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inputMatrix(int x[][], int r, int c){

        System.out.println("Enter the elements of the matrix");
        
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
    public static void main (String[] args){

        System.out.println("Enter the size of row:");
        int row = s1.nextInt();

        System.out.println("Enter the size of Column");
        int col = s1.nextInt();

        int arr[][] = new int [row][col];

        inputMatrix(arr, row, col);

        System.out.println("The given matrix is:");

        showMatrix(arr, row, col);

        upperDiagonal(arr, row, col);



    }
    
}
