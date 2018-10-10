/**
 * Created by Tal on 6/27/2018.
 */
public class BinaryGap {
    /*
    public static void main(String[] args){
        BinaryGapSolution s = new BinaryGapSolution();
        System.out.println(s.solution(1376796946));
    }
    */
}


class BinaryGapSolution{
    public int solution(int n){
        String s = toBinary(n);
        return countGap(s);
    }

    private String toBinary(int n) {
        StringBuilder s =  new StringBuilder();
        for(int i = n; i > 0; i /= 2){
            s.append(i%2);
        }

        return (s.reverse()).toString();
    }


    private int countGap(String s) {
        int i = 0;
        int res = 0,temp = 0;
        boolean done = false;
        char[] str = s.toCharArray();
        for(; i < str.length; i++) {
            if(str[i] == '1') {
                i++;
                break;
            }
        }

        for(; i < str.length; i++) {
           if(str[i] == '0')
               temp++;
           else {
               if (res < temp) {
                   res = temp;
                   done = true;
               }
               temp = 0;
           }
        }

        if(done)
            return res;
        else
            return 0;
    }


}