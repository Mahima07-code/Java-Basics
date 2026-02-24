import java.util.*;

public class Merge {
    static Scanner s1 = new Scanner(System.in);


   

    public static void inputArray(int[] var0, int var1) {
      System.out.println("enter the elements of array ");

      for(int var2 = 0; var2 < var1; ++var2) {
         var0[var2] = s1.nextInt();
      }

   }

   public static void mergeArray(int []x, int[]y, int size1, int size2){

    int size3 = x.length+ y.length;
    int p[] = new int[size3];
    x[size1] = 9999999999;
    y[size2] = 9999999999;
    

    for(int i =0; i<size3; i++){
        if(x[i]<y[i]){
            p[i] =x[i];
            x[i]=x[i+1];
        }
        else if(y[i]<x[i]){
            p[i] =y[i];
            y[i]=y[i+1];
        }
    }
    

   }

   public static void showArray(int x[],int size){
        
        for(int i=0; i<size; i++){
            System.out.println(x[i]);
    
        }
    }
    public static void main(String []args){

        System.out.println("enter the size of first array");
        int size1 = s1.nextInt();
        int x[]=new int[size1];
        inputArray(x, size1);

        System.out.println("enter the size of second array");
        int size2 = s1.nextInt();
        int y[]=new int[size2];
        inputArray(y, size2);
       
        int size3 = size1+size2;
        int z[]=new int[size3];
        
        mergeArray(x, y, size1, size2);
        
        showArray(z, size3);


    } 

    
}
