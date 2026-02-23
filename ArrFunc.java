import java.util.*;

public class ArrFunc {
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
    
    public static void MaxArray(int x[],int size){
        int max = x[0];
        for(int i=1; i<size; i++){
            if(x[i]>max)
                max = x[i];
    
        }
        System.out.println("The maximum element is "+ max);
    }
    public static void main(String []args){
        
        System.out.println("Enter size of array");
        int n=s1.nextInt();
        int x[]=new int[n];
        inputArray(x,n);
        System.out.println("Array is");
        showArray(x,n);
        MaxArray(x,n);


        
      
    }
    

    
}
