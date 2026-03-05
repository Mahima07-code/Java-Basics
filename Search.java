/* write a fucntion search that will take an array ,its size and the element to be search as an argument, 
 funtion will return -1 in case, element not found 
 otherwise will return index of the element of the aaray .
 */
import java.util.*;

public class Search {
    static Scanner sc = new Scanner(System.in);

    public static int SearchArray(int []p, int size, int el){
        int f=-1;
        for(int i =0; i<size; i++){
            if(p[i] == el){
                f=i;
                break;
            }
        }
       return f;
    }

    public static void main(String []args){
    System.out.println("enter the size of array");
    int n = sc.nextInt();

    int x[] = new int[n];
    System.out.println("Enter Array");
    for(int i =0; i<x.length; i++){
        x[i] = sc.nextInt();
    }

    System.out.println("Enter element to be searched");
    int s = sc.nextInt();

    int a=SearchArray(x,n,s);
    if(a==-1)
        System.out.println("Not Found");
    else
        System.out.println("found at index" + (a+1));


    }
    
}