package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Disk d1 = new Disk();
        d1.setTracks(new Track[]{
                new Track("Jaz", "Song1", 4.13),
                new Track("Rock", "Song2", 2.35),
                new Track("Jaz", "Song3", 4.33),
                new Track("Jaz", "Song4", 5.33),
                new Track("Jaz", "Song5", 6.33),
                new Track("Rock", "Song6", 1.33)});
        //  Track t1 = new Track ("Jaz", "Song1", 2.33);
        System.out.println(d1.toString());

        

    }
}
