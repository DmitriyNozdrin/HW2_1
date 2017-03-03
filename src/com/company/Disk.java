package com.company;

import java.util.Arrays;
import java.util.*;


/**
 * Created by DmitriyN on 3/3/2017.
 */
public class Disk  {

public Track [] tracks;

    public Track[] getTracks() {
        return tracks;
    }

    public void setTracks(Track[] tracks) {
        this.tracks = tracks;
    }






    @Override
    public String toString() {
        return "Disk{" +
                "tracks=" + Arrays.toString(tracks) +
                '}';
    }




     /* Перегрузка метода compareTo */


    }


