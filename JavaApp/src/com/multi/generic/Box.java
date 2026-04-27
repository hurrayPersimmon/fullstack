package com.multi.generic;

public class Box<TT> {
    private TT item;

    public void setItem(TT item) {
        this.item = item;
    }

    public TT getItem() {
        return item;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("딸기");
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(1);

    }

}
