package com.multi.inheritance;

// abstract Class (완성 + 미완성)
public abstract class FileUploader {
    public void connect(){
        System.out.println("server Connected");
    }

    public abstract void upload();

}
