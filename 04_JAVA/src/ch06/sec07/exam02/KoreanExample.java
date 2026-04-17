package ch06.sec07.exam02;

public class KoreanExample {

    public static void main(String[] args) {
        Korean k1 = new Korean("마리오", "123456-1234567");
        Korean k2 = new Korean("루이지", "123456-1234567");
        System.out.println(k1.nation + " " + k1.name + " " + k1.ssn);
        System.out.println(k2.nation + " " + k2.name + " " + k2.ssn);
    }

}
