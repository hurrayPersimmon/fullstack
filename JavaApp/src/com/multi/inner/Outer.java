package com.multi.inner;

public class Outer extends SuperOuter{
    private int outer;
    //member inner class
    public class Inner {
        private int outer;
        public Inner() {
            //inner class can reach outer class field
            outer = 100;
            Outer.this.outer = 1000;
            protectedValue = 150;
//            privateValue = 20;
        }

    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer(). new Inner();

        System.out.println(inner.outer);
    }
}
