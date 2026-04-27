package com.multi.interfaceExam;

// Java는 단일 상속이다.
public class AWindowClass{

    public AWindowClass() {
        //Anonymous - 익명
        new AbstractWindowClass(){
            @Override
            public void mouseClicked() {
                super.mouseClicked();
            }
        };
    }


}
