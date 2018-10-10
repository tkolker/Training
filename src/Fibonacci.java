/**
 * Created by Tal on 7/11/2018.
 */
public class Fibonacci {
    public static void main(String [] args){
        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int i){
        if(i == 0)
            return -1;
        if(i == 1)
            return 1;
        if(i == 2)
            return 1;

        return fibonacci(i-1) + fibonacci(i-2);
    }


}
