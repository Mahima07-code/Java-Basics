// QUES:-
// you have taken two array input assuming in sorted order.
// You have to merge these sorted array and form a new array which is sorted also.

import java.util.*;

public class Merge {
    static Scanner s1 = new Scanner(System.in);


   

    public static void inputArray(int[] x, int size) {
        System.out.println("enter the elements of array ");

        for(int i = 0; i < size; i++) {
             x[i] = s1.nextInt();
        }

   }

   public static void showArray(int x[],int size){
        
        for(int i=0; i<size; i++){
            System.out.println(x[i]+" ");
    
        }
    }

   public static void mergeArray(int []x, int[]y, int z[],int size1, int size2){
        int i,j,k;
        for(i =0,j=0,k=0; i<size1 && j<size2;){
            if(x[i]<y[j]){
                z[k]=x[i];
                k++;
                i++;
            }
            else if(x[i]>y[j]){
                z[k]=y[j];
                k++;
                j++;
            }
            
        }

        if(i<size1){
            while(i<size1){
                z[k]=x[i];
                k++;
                i++;
            }
        }
        if(j<size2){
            while(j<size2){
                z[k]=y[j];
                k++;
                j++;
            }
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
        
        mergeArray(x, y, z,size1, size2);
        
        System.out.println("First array is");

        showArray(x, size1);

        System.out.println("second  array is");

        showArray(y, size2);

        System.out.println("After merging third array is");

        showArray(z, size3);



    } 

    
}
