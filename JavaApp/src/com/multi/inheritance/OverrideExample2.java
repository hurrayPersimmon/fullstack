package com.multi.inheritance;

public class OverrideExample2 extends Object {

    public void method(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        OverrideExample2 o = new OverrideExample2();
        o.method();
    }

}
