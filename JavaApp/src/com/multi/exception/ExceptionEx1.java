package com.multi.exception;

public class ExceptionEx1 {

    public void arrayIndexOutOfBoundsException(){
        int[] m = new int[5];
        for (int i = 0; i <= m.length; i++) {
            try{
                m[i] = i + 1;
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.err.println(e);
            }finally {
                System.out.println(m[i]);
            }
        }
    }

    public void cloneNotSupportedException(){
        try{
            ExceptionEx1 exceptionEx1 = new ExceptionEx1();
            ExceptionEx1 e2 = (ExceptionEx1) exceptionEx1.clone();
            System.out.println(e2);
        }catch (Throwable e){
            e.printStackTrace();
        }
    }

    public void cloneNotSupportedException2() throws CloneNotSupportedException {
        ExceptionEx1 e = (ExceptionEx1) this.clone();
    }

        public static void main(String[] args) throws CloneNotSupportedException,
            NullPointerException {
        ExceptionEx1 ex1 = new ExceptionEx1();
//        ex1.arrayIndexOutOfBoundsException();
        ex1.cloneNotSupportedException();
        ex1.cloneNotSupportedException2();
    }

}
