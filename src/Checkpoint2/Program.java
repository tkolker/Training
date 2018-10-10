package Checkpoint2;

import java.util.*;

/**
 * Created by Tal on 7/11/2018.
 */
public class Program {
    public static void main (String[] args){
        Map<Integer, Integer> messages = new HashMap<>();
        Set<Integer> bigSenders = new HashSet<>();
        int counter = 0, minPercent;
        boolean eof = false;
        Scanner in = new Scanner(System.in);
        String line;

        while(!eof){
            line = in.nextLine();
        }

        for (Integer key: messages.keySet()){
            counter += messages.get(key);
        }

        minPercent = counter / 10;

        for (Integer key: messages.keySet()){
            if(messages.get(key) >= minPercent){
                bigSenders.add(key);
            }
        }
    }
}
