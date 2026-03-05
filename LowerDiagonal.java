// QUES:-
// Print the elements of the lower diagonal of the matrix in the same pattern.
import java.util.Scanner; 
public class LowerDiagonal {
    static Scanner s1 = new Scanner(System.in);

    public static void lowerDiagonal(int x[][], int r , int c){
        System.out.println("The lower diagonal elments are :-");
        for(int i =0; i<r; i++){
            for(int j=0; j<=i; j++){
                System.out.print(x[i][j]+" ");
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

    
    public static void main(String[] args) {

        System.out.println("Enter the size of row:");
        int row = s1.nextInt();

        System.out.println("Enter the size of Column");
        int col = s1.nextInt();

        int arr[][] = new int [row][col];

        inputMatrix(arr, row, col);

        System.out.println("The given matrix is:");

        showMatrix(arr, row, col);

        lowerDiagonal(arr, row, col);

        
    }
    
}
