import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tal on 6/27/2018.
 */
public class OddOccurrencesInArray {

    public static void main(String[] args){
        OddOccurrencesInArraySolution s = new OddOccurrencesInArraySolution();
        int[] arr = {9,3,9,3,9,7,9};
        System.out.println(s.solution(arr));
    }

}

class OddOccurrencesInArraySolution {
    public int solution(int[] a) {
        int res = 0;
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i:a) {
            if(pairs.containsKey(i))
                pairs.put(i, pairs.get(i)+1);
            else
                pairs.put(i, 1);
        }

        for(int key: pairs.keySet()) {
            if(pairs.get(key) % 2 == 1){
                res = key;
                break;
            }
        }

        return res;
    }
}

