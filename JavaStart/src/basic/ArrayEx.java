package basic;

public class ArrayEx {

    public static void main(String[] args) {
        int[] array = new int[3];

        //shallow copy
        int []bArray =  array;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        for(int value : bArray){
            System.out.println(value);
        }
    }
}