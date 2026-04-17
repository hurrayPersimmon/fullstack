package ch06.sec08.exam02;

public class Computer {

    public int sum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public void print(int index, int result) {
        System.out.println("result" + index + ": " + result);
    }

}
