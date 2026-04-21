package com.multi.inheritance;

// 1. 자식도 abstract class가 되기
// 2. 자식이 abstract method를 override하여 메소드 완성하기
public class ImageUploader extends FileUploader{

    @Override
    public void upload() {
        System.out.println("I am image uploader");
    }
}
