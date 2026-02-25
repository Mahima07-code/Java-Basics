import java.util.Scanner;

public class Delete {

    static Scanner s1 = new Scanner(System.in);

    public static void inputArray(int p[],int size){
        
        System.out.println("enter the elements of array ");
        for(int i =0; i<size; i++){
            p[i] = s1.nextInt();
        }
    }

    public static void showArray(int x[],int size){
        
        for(int i=0; i<size; i++){
            System.out.println(x[i]);
    
        }
    }

    public static int positionArray(int x[],int size, int el){
        int pos = -1;
        for(int i =0; i<size; i++){
            if(el==x[i]){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void deleteArray(int x[], int size, int el){
        int pos =positionArray(x, size, el);
        if(pos==-1)
            System.out.println("Element is not present ");
        else
            for(int j=pos; j<size-1; j++){
                x[j] =x[j+1];
        }
    
    }
    




    public static void main(String[] args) {

        System.out.println("Enter the size of the array :");
        int n = s1.nextInt();

        int x[] = new int[50];
        inputArray(x, n);

        System.out.println("Enter the new element  to be deleted :");
        int el =s1.nextInt();

        
        System.out.println("The original array is :");
        showArray(x,n);

        deleteArray(x, n, el);
        
        System.out.println("new array is :");
        showArray(x,n-1);

        
        
    }
    
}
