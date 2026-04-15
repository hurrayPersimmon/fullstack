package ch04.sec04;

public class SumWhileFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while(i < 100) {
            sum += i+1;
            i++;
        }
        System.out.println("1~100의 합: " + sum);
    }

}
