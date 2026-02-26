// QUES:-
// To tranpose a mtrix i.e convert rows into columns.

import java.util.Scanner;


public class Transpose {

    public static void inputMatrix(int x[][], int r, int c){
        System.out.println();
        System.out.println("Enter the elemets of the matrix");
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

    public static void transposeMatrix(int x[][],int y[][], int r , int c){
        for(int i =0; i<r; i++){
            for(int j=0; j<c; j++){
                y[j][i] = x[i][j];
            }
        }
    }

    static Scanner s1 = new Scanner(System.in);
    
    public static void main(String []args){

        System.out.println("Enter the size of row:");
        int row = s1.nextInt();

        System.out.println("Enter the size of Column");
        int col = s1.nextInt();

        int arr[][] = new int [row][col];

        inputMatrix(arr, row, col);

        int arr2[][] = new int[col][row];

        transposeMatrix(arr, arr2, row, col);

        System.out.println("The given matrix is:");
        showMatrix(arr, row, col);
        
        System.out.println("The  matrix after transposing:");
        showMatrix(arr2, col, row);


    }
    
}
