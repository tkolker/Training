

import java.util.HashMap;

public class GenomicRangeQueries {
    public static void main(String[] args){
        GenomicRangeQueriesSolution s = new GenomicRangeQueriesSolution();
        String genome = "CAGCCTA";
        int[] p = {2,5,0};
        int[] q = {4,5,6};
        printIntArr(s.solution(genome, p, q));
    }

    private static void printIntArr(int[] arr) {
      for(int i : arr){
          System.out.print(i + " ");
      }
    }

}

class GenomicRangeQueriesSolution {
    /* O(N*M)
    public int[] solution(String S, int[] P, int[] Q) {
        HashMap<Character, Integer> impactFactors = createImpactFactorsMap();
        int[] sFactors = new int[S.length()];
        char[] Sarr = S.toCharArray();
        int i = 0;
        int[] res = new int[P.length];

        for(int x = 0; x < res.length; x++)
            res[x] = 4;

        for(char c: Sarr){
            sFactors[i] = impactFactors.get(c);
            i++;
        }

        for(int j = 0; j < P.length; j++){
            for(int k = P[j]; k <= Q[j]; k++){
                if(sFactors[k] < res[j]){
                    res[j] = sFactors[k];
                }
            }
        }

        return res;

    }

    private HashMap<Character, Integer> createImpactFactorsMap() {
        HashMap<Character, Integer> impactFactors = new HashMap<>();
        impactFactors.put('A', 1);
        impactFactors.put('C', 2);
        impactFactors.put('G', 3);
        impactFactors.put('T', 4);

        return impactFactors;
    }
    */

    public int[] solution(String S, int[] P, int[] Q) {
        int[][] prefixSum = new int[S.length() + 1][4];

        /*
        for (int i = 0; i < 4; i++) {
            prefixSum[0][i] = 0;
        }
        */

        char[] s = S.toCharArray();

        for (int i = 1; i < S.length() + 1; i++) {
            for (int j = 0; j < 4; j++) {
                int nucleotideValue = 0;
                switch (s[i - 1]) {
                    case 'A':
                        nucleotideValue = 0;
                        break;
                    case 'C':
                        nucleotideValue = 1;
                        break;
                    case 'G':
                        nucleotideValue = 2;
                        break;
                    case 'T':
                        nucleotideValue = 3;
                        break;
                }
                prefixSum[i][j] += prefixSum[i - 1][j];
                if (nucleotideValue == j) {
                    prefixSum[i][j]++;
                }
            }
        }

        int[] minimalImpactFactors = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int a = P[i];
            int b = Q[i];

            for (int j = 0; j < 4; j++) {
                if (prefixSum[b + 1][j] - prefixSum[a][j] > 0) {
                    minimalImpactFactors[i] = j + 1;
                    break;
                }
            }
        }
        return minimalImpactFactors;
    }
}

