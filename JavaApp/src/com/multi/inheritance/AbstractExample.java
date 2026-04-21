package com.multi.inheritance;

public class AbstractExample {

    // strategy pattern - 누가 들어오는지에 따라 전략이 변경
    // 업캐스팅, upload는 추상메소드로 무조건 자식메소드에 오버라이딩 되어야 함.
    public static void startUpload(FileUploader uploader) {
        uploader.upload();
    }



    public static void main(String[] args) {
        AbstractExample.startUpload(new ImageUploader());
        AbstractExample.startUpload(new VideoUploader());
    }

}
