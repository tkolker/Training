import java.util.Arrays;
import java.util.Stack;

public class StoneWall {
    public static void main(String[] args){
        StoneWallSolution s = new StoneWallSolution();
        int[] arr = {8,8,5,7,9,8,7,4,8};
        System.out.println(s.solution(arr));
    }
}

class StoneWallSolution {
    int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < H.length; i++) {
            int h = H[i];

            // Pop until last element in stack greater or equals current element
            while (!stack.empty() && h < stack.peek()) {
                stack.pop();
            }
            // Stack is empty or h is grater than top, add height and increment count
            if(stack.empty() || h > stack.peek()){
                stack.push(h);
                count++;
            }
        }
        return count;
    }
}
