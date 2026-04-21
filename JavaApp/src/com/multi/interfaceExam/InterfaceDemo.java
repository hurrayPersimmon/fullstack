package com.multi.interfaceExam;

// 완전 추상 클래스
public interface InterfaceDemo {
//    int data; -> interface는 final static이 생략, intiailize 해줘야 함.
    int data = 120;

    public default void method1() {}

    public abstract void method2();

    public static void showMethod(){

    }
}
