package com.multi.array;

public class ArrayEx2 {

    public void arrayExDemo1(int[][] array){
        // reference type인 배열을 매개변수로 전달할 때, 배열의 주소값이 전달된다.
        // 따라서 매개변수로 전달된 배열의 요소를 변경하면,
        // main 메소드에서 참조하는 배열의 요소도 변경된다.
        array[0][0] = 100;

        for(int i=0; i<array.length-1; i++){ // 행
            for(int j=0; j<array[i].length-1; j++){
                System.out.print(array[i][j] + " "); //열
            }
            System.out.println();
        }



    }

    public void print(int[][] array){
        // java의 배열은 가변배열이다. 따라서 각 행마다 열의 개수가 다를 수 있다.
        for(int i=0; i<array.length; i++){ // 행
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " "); //열
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayEx2 arrayEx2 = new ArrayEx2();
        int [][] m = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};

        arrayEx2.arrayExDemo1(m);
        arrayEx2.print(m);
    }



}
