public class VariableDemo {
    static int c;
    static void sumNumber(int a,int b){
        
        c=a+b;

    }
    public static void main(String ar[]){
        int x,y;
        x=100;
        y=200;
        sumNumber(x, y);
        System.out.println("Sum is"+c);

    }
}
