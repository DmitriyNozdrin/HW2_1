package com.company;

/**
 * Created by DmitriyN on 3/3/2017.
 */
public class Track {
    private final String style;
    private final String name;
    private final double time;

    public Track(String Style, String name, double time) {
        style = Style;
        this.name = name;
        this.time = time;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Track{" +
                "style='" + style + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
