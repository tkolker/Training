import java.util.HashMap;

public class Dominator {
    public static void main(String[] args){
        DominatorSolution s = new DominatorSolution();
        int[] A = {3,4,3,2,3,-1,3,3};
        System.out.println(s.solution(A));
    }

}

class DominatorSolution {
    public int solution(int[] A) {
        if(A.length == 0)
            return -1;

        HashMap<Integer, Integer> map = new HashMap();
        int size = A.length;

        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i]))
                map.put(A[i], map.get(A[i]) + 1);

            else
                map.put(A[i], 1);
        }

        for(int i = 0; i < A.length; i++){
            if(map.get(A[i]) > size / 2)
                return i;
        }

        return -1;
    }
}
