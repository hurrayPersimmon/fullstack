package com.multi.oop;

public class StaticEx {
    //인스턴스 변수 -> heap
    private int instanceValue;
    private static int staticValue;

    //로딩시점에 클래스영역 (메소드 영역)에 로딩
//    public static void increment() {

//    }

    public void increment() {
        // 지역변수 -> Stack
        int localValue=0;
        localValue++;
        this.instanceValue++;
        staticValue++;
        System.out.println("localValue"+localValue);
        System.out.println("instanceValue"+instanceValue);
        System.out.println("staticValue"+staticValue);

    }


    public static void main(String[] args) {
        StaticEx staticEx = new StaticEx();
        staticEx.increment();
        staticEx.increment();
        staticEx.increment();

    }




}
