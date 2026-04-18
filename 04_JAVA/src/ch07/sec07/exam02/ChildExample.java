package ch07.sec07.exam02;

public class ChildExample {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();

        parent.method1();
        parent.method2();
        //부모에 해당 메소드를 정의하지 않았음.
        //부모는 자식에 해당하는 메소드를 호출할 수 없음.
//        parent.method3();
    }
}
