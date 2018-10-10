import java.util.Stack;

public class Fish {
    public static void main(String[] args){
        FishSolution s = new FishSolution();
        int[] A = { 4,3,2,1,5};
        int[] B = {0,1,0,0,0};
        System.out.println(s.solution(A, B));
    }

}

class FishSolution {
    public int solution(int[] A, int[] B) {
        Stack<Integer> downstream =  new Stack<>();
        int fishes = 0;
        boolean fight;

        for (int i = 0; i < A.length ;i++){
            fight = true;
            while (fight && (downstream.size() > 0) && (B[i] == 0)) {
                if (downstream.peek() > A[i]){
                    fight = false;
                }else
                    downstream.pop();
            }

            if  (B[i] == 1){
                downstream.push(A[i]);
            }
            else if (downstream.isEmpty())
                fishes++;
        }

        fishes += downstream.size();

        return fishes;
    }
}
