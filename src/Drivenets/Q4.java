package Drivenets;

/**
 * Created by Tal on 7/16/2018.
 */
public class Q4 {
    public static void main(String[] args){
        Q4Solution solution = new Q4Solution();
        int[] arr = {1,2,3,4,5,6};
        System.out.println(solution.solution(arr, 3));
    }
}


class Q4Solution {
    public int solution (int[] A, int K) {
        int n = A.length; // num nails
        int best = 0;
        int count = 1;
        //int count = 0;
        for (int i = 0; i < n - K - 1; i++) {
            if (A[i] == A[i + 1])
                count = count + 1;
            else {
                count = 1;
                //count = 0;
            }
            if (count > best)
                best = count;
        }
        int result = best + K;
        //int result = (n<=K)? n : best + 1 + K;

        return result;
    }


}
