import java.util.*;

public class Insert {

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


    public static int positionArray(int p[],int size,int el){

        // Assuming the array is in ascending order
        int pos=-1;
        if(el>p[size -1]){
            pos=size ;
        }
        else if(el<p[0]){
            pos=0;
        }
        else{
            for(int i=0; i<size; i++){
                if(el>p[i] && el<p[i+1]){
                    pos=i+1;
                }

            }
        
        }
        return pos;
    }

    public static void insertArray(int p[],int size,int el){
        int pos=positionArray(p,size,el);
        

        for(int i=size; i>pos; i--){
            p[i] = p[i-1];
        }
        p[pos]=el;

    }
    public static void main(String []args){

        System.out.println("Enter the size of the array :");
        int n = s1.nextInt();

        int x[] = new int[50];
        inputArray(x, n);

        System.out.println("Enter the new element  to be inserted :");
        int el =s1.nextInt();

        
        System.out.println("The original array is :");
        showArray(x,n);

        insertArray(x, n, el);
        System.out.println("new array is :");
        showArray(x,n+1);

        
        
    }
}

