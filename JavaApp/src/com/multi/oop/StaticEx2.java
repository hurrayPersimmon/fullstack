package com.multi.oop;

public class StaticEx2 {
    private int data;
    private static StaticEx2 instance;

    private StaticEx2() {
        this.data = 10;
    }

    // static으로 선언해서 method 영역에 미리 설정
    public static StaticEx2 getInstance() {
        // this는 인스턴스 변수를 가르키므로 로딩 이전에는 접근할 수 없음.
        return instance;
    }

    public StaticEx2(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
