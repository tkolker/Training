package Drivenets;

/**
 * Created by Tal on 7/16/2018.
 */
public class Q1 {
    public static void main(String[] args){
        Q1Solution solution = new Q1Solution();
        System.out.println(solution.solution(24477, 8772));
    }
}


class Q1Solution {
    int solution(int A, int B) {
        long mult = A * B;
        int counter = 0;
        int digit;

        /*
        while(mult > 0){
            counter += mult & 1;
            mult >>= 1;
        }
        */

        while (mult > 0) {
            digit = (int) (mult % 2);
            if ((digit & 1) == 1) {
                ++counter;
                }
                mult >>= 1;
            }

        return counter;
    }
}