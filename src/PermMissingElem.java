


public class PermMissingElem {
    public static void main(String[] args){
        PermMissingElemSolution s = new PermMissingElemSolution();
        int[] arr = {2, 1, 5, 4};
        System.out.println(s.solution(arr));
    }
}


class PermMissingElemSolution {
    public int solution(int[] a) {
        int sum = 0, total = 0;
        for (int i = 1; i <= a.length + 1; i++) {
            total += i;
        }

        for (int i:a) {
            sum += i;
        }

        return total - sum;
    }
}
