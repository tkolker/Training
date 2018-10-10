/**
 * Created by Tal on 6/27/2018.
 */
public class FrogJmp {
    public static void main(String[] args){
        FrogJmpSolution s = new FrogJmpSolution();
        System.out.println(s.solution(10, 85, 30));
    }

}

class FrogJmpSolution {
    public int solution(int x, int y, int d) {
        if((y - x) % d == 0)
            return (y - x) / d;
        else
            return (y - x) / d + 1;
    }
}
