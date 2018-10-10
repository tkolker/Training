package Drivenets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tal on 7/16/2018.
 */
public class Q2 {
    public static void main(String[] args){
        Q2Solution sol = new Q2Solution();
        String s = sol.solution("11.05.1992 r-x delete-this.html\n30.11.1987 r-- system.dll\n05.12.1973 r-- readme.html\n29.09.2010 r-- podcast.flac\n21.06.1972 rw- setup.png\n10.08.2009 --x moonlight-sonata.flac\n28.02.2000 r-- file.flv\n");
        System.out.println(s);
    }
}


class Q2Solution {
    public String solution(String s) {
        String line;
        int counter = 0;
        BufferedReader reader = new BufferedReader(new StringReader(s));

        try {
            while((line = reader.readLine()) != null){
                String[] splitLine = line.split(" ");
                if(checkDateLimit(splitLine[0]) && checkReadonly(splitLine[1]))
                    counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return counter > 0 ? Integer.toString(counter) : "NO FILES";
    }

    private boolean checkReadonly(String permissions) {
        char[] permArr = permissions.toCharArray();
        if(permArr[0] == 'r' && permArr[1] == '-')
            return true;

        return false;
    }

    private boolean checkDateLimit(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null, dateLimit = null;

        try {
            date = format.parse(dateStr);
            dateLimit = format.parse("28.02.2000");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return !date.after(dateLimit);
    }
}
