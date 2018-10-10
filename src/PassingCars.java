/**
 * Created by Tal on 7/1/2018.
 */
public class PassingCars {
    public static void main(String[] args){
        PassingCarsSolution s = new PassingCarsSolution();
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,};
        System.out.println(s.solution(arr));
    }
}


class PassingCarsSolution {
    public int solution(int[] a) {
        int pairs = 0, symbolCount = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                pairs += symbolCount;
            }
            else{
                symbolCount++;
            }
        }

        return pairs > 1000000000? -1 : pairs;
    }
}