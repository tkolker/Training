package Drivenets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Tal on 7/16/2018.
 */
public class Q3 {
    public static void main(String[] args){
        Q3Solution solution = new Q3Solution();
        String s = solution.solution("my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b");
        System.out.println(s);
    }
}


class Q3Solution {
    public String solution(String S) {
        int musicSize = 0, moviesSize = 0, imagesSize = 0, othersSize = 0;
        BufferedReader reader = new BufferedReader(new StringReader(S));
        String line;
        String[] splitLine;
        String ext;
        int size;

        try {
            while((line = reader.readLine()) != null){
                splitLine = line.split(" ");
                ext = splitLine[0].substring(splitLine[0].lastIndexOf('.') + 1);
                size = Integer.parseInt(splitLine[1].substring(0, splitLine[1].length() - 1));

                if(fileIsMusic(ext)){
                    musicSize += size;
                }
                else if(fileIsMovie(ext)){
                    moviesSize += size;
                }
                else if(fileIsImage(ext)){
                    imagesSize += size;
                }
                else{
                    othersSize += size;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return String.format("music %db\nimages %db\nmovies %db\nother %db", musicSize, imagesSize, moviesSize, othersSize);
    }

    private boolean fileIsImage(String ext) {
        String[] image = {"jpg", "bmp", "gif"};
        for (String s: image){
            if(s.equals(ext)){
                return true;
            }
        }

        return false;
    }

    private boolean fileIsMovie(String ext) {
        String[] movie = {"mp4", "avi", "mkv"};
        for (String s: movie){
            if(s.equals(ext)){
                return true;
            }
        }

        return false;
    }

    private boolean fileIsMusic(String ext) {
        String[] music = {"mp3", "aac", "flac"};
        for (String s: music){
            if(s.equals(ext)){
                return true;
            }
        }

        return false;
    }
}
