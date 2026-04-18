package com.multi.oop;

public class Font {
    private String face;
    private int size;
    private String color;

    public Font() {
        this("");

    }

    public Font(String face){
        this.face = face;
    }

    public Font(String face, int size){
        this.face = face;
        this.size = size;
    }

    public Font(String face, int size, String color){
        this.face = face;
        this.size = size;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Font{" +
            "face='" + face + '\'' +
            ", size=" + size +
            ", color='" + color + '\'' +
            '}';
    }


}
