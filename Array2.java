import java.util.*;

public class Array2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int x[] = new int[5];
        for(int i =0; i<x.length; i++){
            x[i] = sc.nextInt();
        }
        int max = x[0];
        for(int i=1; i<x.length; i++){
             if(x[i]>max)
                max = x[i];
        }
        System.out.println("Maximum is "+ max);
        sc.close();
    }
}
