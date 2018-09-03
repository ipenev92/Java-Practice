package com.ivanp2;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int width;
    private int sheets;
    private boolean made;

    public Bed(String style, int pillows, int height, int width, int sheets, boolean made) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.width = width;
        this.sheets = sheets;
        this.made = made;
    }

    public void make() {
        System.out.println("Making bed");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getSheets() {
        return sheets;
    }

    public boolean isMade() {
        return made;
    }
}
