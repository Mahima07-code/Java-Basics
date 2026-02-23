import java.util.concurrent.SubmissionPublisher;
import java.util.*;

public class VariableDemo {
    
    static void sumNumber(){
        static int c=0;
        c++;
        System.out.println("Value of c is "+c);

    }
    public static void main(String ar[]){
        sumNumber();
        sumNumber();
        sumNumber();
    }
}
