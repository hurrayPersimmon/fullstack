package array;

import java.util.Arrays;

public class ArrayEx1 {
    //parameter(instance)
    public void arrayDemo1(){
        int[] m1 = new int[5];
        int[] m2 = new int[3];
        int[] m3 = new int[2];

        //reference copy
        m1 = m2; //shallow copy

        for(int i =0; i<m1.length; i++) {
            System.out.println(m1[i]);
        }
    }

    public void arrayDemo2(){
        int[] x = new int[]{1,2,3,4,5};
        for (int xx : x) {
            System.out.println(xx);
        }
    }


    public void arrayDemo3(int ...x) {
        //call by reference
        System.out.println(Arrays.toString(x));
    }

//    public void arrayDemo3(int x, int y, int z, int k) {
//    }

    public void arrayDemo4(Object[] p){
        //Object는 Wrapper 클래스의 최상위 클래스이므로, Integer, String 모두 Object로 받을 수 있다.
        // 하지만, primitive type은 Object로 받을 수 없다. 따라서, Integer[]로 받아야 한다.
    }

    public int arrayDemo5(int[] y){
        return y[0];
    }

    public static void main(String[] args) {
        ArrayEx1 a = new ArrayEx1();
        a.arrayDemo1();
        a.arrayDemo3(1,2,3,4);
        a.arrayDemo4(new Integer[]{1,2,3,4,5});
        a.arrayDemo4(new String[]{"1","2","3","4","5"});
        a.arrayDemo5(new int[]{1,2,3,4,5});
    }

}
