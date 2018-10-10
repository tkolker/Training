/**
 * Created by Tal on 7/1/2018.
 */
public class MaxCounters {
    public static void main(String[] args){
        MaxCountersSolution s = new MaxCountersSolution();
        int[] arr = {3,4,4,6,1,4,4};
        System.out.println(s.solution(5, arr));
    }
}


class MaxCountersSolution {
    public int[] solution(int n, int[] a) {
        int maxC = 0;
        int lastIncrease = 0;
        int[] counters = new int[n];

        for (int i : a) {
            if(i <= n){
                counters[i-1] = Math.max(counters[i-1], lastIncrease);
                counters[i-1]++;
                maxC = Math.max(maxC, counters[i-1]);
            }
            else{
                lastIncrease = maxC;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastIncrease);
        }

        return counters;
    }
}
