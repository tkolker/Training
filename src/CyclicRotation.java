/**
 * Created by Tal on 6/27/2018.
 */
public class CyclicRotation {
    /*
    public static void main(String[] args){
        CyclicRotationSolution s = new CyclicRotationSolution();
        int[] arr = {};
        System.out.println(s.solution(arr, 3));
    }
    */
}

class CyclicRotationSolution {
    public int[] solution(int[] a, int k) {
        if(a.length == 0)
            return a;
        for(int i = 0; i < k; i++)
            a = rotate(a);
        return a;
    }

    private int[] rotate(int[] a) {
        int temp = a[a.length - 1];
        for(int i = a.length - 1; i > 0; i--){
            a[i] = a[i-1];
        }
        a[0] = temp;
        return a;
    }
}
