/**
 * Created by Tal on 7/1/2018.
 */
public class PermCheck {
    public static void main(String[] args){
        PermCheckSolution s = new PermCheckSolution();
        int[] arr = {2, 1, 4, 5, 3, 7, 6};
        System.out.println(s.solution(arr));
    }
}


class PermCheckSolution {
    public int solution(int[] a) {
        int max = a[0];
        for(int i:a){
           if(i > max){
               max = i;
           }
        }

        int[] temp = new int[max + 1];
        temp[0] = 1;

        for (int i:a) {
            if(temp[i] > 0)
                return 0;
            temp[i]++;
        }

        for (int i:temp) {
            if(i == 0)
                return 0;
        }

        return 1;
    }
}
