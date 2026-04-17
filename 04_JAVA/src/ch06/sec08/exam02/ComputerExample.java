package ch06.sec08.exam02;

public class ComputerExample {

    public static void main(String[] args) {
        Computer myCom = new Computer();
        int result1 = myCom.sum(1, 2, 3);
        myCom.print(1, result1);

        int result2 = myCom.sum(1, 2, 3, 4, 5);
        myCom.print(2, result2);

        int[] values = {1, 2, 3, 4, 5};
        int result3 = myCom.sum(values);
        myCom.print(3, result3);

        int result4 = myCom.sum(new int[]{1, 2, 3, 4, 5});
        myCom.print(4, result4);


    }

}
