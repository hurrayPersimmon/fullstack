package ch06.sec15;

public class Singleton {

    //생성자 선언, private 접근 제한자로 선언하여 외부에서 객체 생성 불가
    private Singleton() {
    }

    //싱글톤 객체를 저장하는 변수, 정적 필드 선언 및 초기화
    private static Singleton singleton = new Singleton();

    //싱글톤 객체를 얻는 메소드
    public static Singleton getInstance() {
        return singleton;
    }


}
