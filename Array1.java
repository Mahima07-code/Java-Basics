import java.util.Scanner;;
public class Array1 {
    public static void main(String ar[]){
        int x[]=new int[5];
        int[] x1=new int[5];
        int x2[]={33,44,55,66,77};
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Array");
        int s=0;
        for(int i=0;i<x.length;i++){
            x[i]=s1.nextInt();
            s+=x[i];
        }
        for(int i=0;i<x.length;i++){
           
            System.out.println("x"+x[i]);
        }
        for(int i=0;i<x.length;i++){
           
            System.out.println("x2"+x2);
            
        }
        System.out.println("Sum is"+s);
        System.out.println("x1"+x1);

    }

}
