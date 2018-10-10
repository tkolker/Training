import java.util.Arrays;


public class MaxProductOfThree {
    public static void main(String[] args){
        MaxProductOfThreeSolution s = new MaxProductOfThreeSolution();
        int[] arr = {-3, 1,2, -2,5, 6};
        System.out.println(s.solution(arr));
    }

}

class MaxProductOfThreeSolution {
    int solution(int[] A) {
        Arrays.sort(A);
        int len = A.length;

        int twoNeg = A[0] * A[1] * A[len - 1];
        int pos = A[len - 1] * A[len - 2] * A[len - 3];
        return twoNeg > pos ? twoNeg : pos;
    }
}
