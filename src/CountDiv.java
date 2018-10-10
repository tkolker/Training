public class CountDiv {
    public static void main(String[] args){
        CountDivSolution s = new CountDivSolution();
        System.out.println(s.solution(3,11,2));
    }

}

class CountDivSolution {
    int solution(int A, int B, int K) {
        int aDiv = A / K;
        int bDiv = B / K;
        int result = bDiv - aDiv;
        if (A % K == 0) {
            result++;
        }
        return result;
    }
}
