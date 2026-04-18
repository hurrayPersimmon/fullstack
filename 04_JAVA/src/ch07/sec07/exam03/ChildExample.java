package ch07.sec07.exam03;

public class ChildExample {

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";

        parent.method1();
        parent.method2();

//        parent.field2 = "data2";
//        parent.method3();

        // 다운캐스팅으로 자식 메소드 및 필드 참조
        ((Child)parent).field2 = "data2";
        ((Child)parent).method3();


        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }


}
