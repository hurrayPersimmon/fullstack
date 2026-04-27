package com.multi.generic;

public class GenericMethodExample {
    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        Double[] doubleArr = {1.1, 2.2, 3.3};
        String[] strArr = {"a", "b", "c"};

        printArray(intArr);
        printArray(doubleArr);
        printArray(strArr);
    }

}
