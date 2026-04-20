package com.multi.inheritance;

public class SmsNotification extends Notification {
    public SmsNotification() {
        //super() -> 부모 생성자 느낌으로 봐도 무방할지 모르겠네
        //다르게 이해하고있었는데..
    }

    @Override
    public void send() { // 부모의 메소드 접근제한자보다 좁은 범위여야한다.
        System.out.println("SMS Notification");
    }
}
