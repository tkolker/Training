
public class TapeEquilibrium {
    public static void main(String[] args){
        TapeEquilibriumSolution s = new TapeEquilibriumSolution();
        int[] arr = {-3,-334,23,443,-883};
        System.out.println(s.solution(arr));
    }

}

class TapeEquilibriumSolution {
    public int solution(int[] a) {
        int left = a[0], right = 0, diff = Math.abs(a[0]);
        for(int i = 1; i < a.length; i++) {
            right += a[i];
            diff += Math.abs(a[i]);
        }

        for(int i = 1; i < a.length; i++){
            if(Math.abs(left - right) < diff){
                diff = Math.abs(left - right);
            }

            left += a[i];
            right -= a[i];
        }

        return diff;
    }
}
