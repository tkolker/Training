

public class Fibonacci2 {
    public static void main(String[] args){
        System.out.println(fibonacciSum(3));
    }

    public static int fibonacciSum(int n){
        int m = n + 2;
        return fibonacciSumUtilIterative(m);
    }

    //recursive
    public static int fibonacciSumUtil(int n){
        int sum = 0;
        if(n == 0)
            return 0;

        if(n == 1 || n == 2)
            return 1;

        sum += fibonacciSumUtil(n-1) + fibonacciSumUtil(n-2);

        return sum;
    }

    //iterative
    public static int fibonacciSumUtilIterative(int n){
        int prev1 = 1, prev2 = 1;
        if(n == 0)
            return 0;

        if(n == 1 || n == 2)
            return 1;

        else{

            for (int i = 0; i < (n-1)/2; i++){
                prev1 = prev1 + prev2;
                prev2 = prev1 + prev2;
            }
        }

        if(n % 2 == 1)
            return prev1;
        else
            return prev2;
    }
}

