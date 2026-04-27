package com.multi.inner;

public class StaticOuter {
    private int outerStatic;

    public void outerMethod(){
        // local variable -> private, static are not Allowed
        // when call method, local variable is made
        // static variable is made when class loaded.
        int staticValue;
    }

    public static class StaticInner {
        private static int staticValue;
        public StaticInner(){
//            outerStatic = 100;
        }


    }

}
