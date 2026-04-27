package com.multi.thread;

public class ThreadEx3 implements Runnable {
    @Override
    //Thread 객체가 돌고 있음.
    public void run() {
        System.out.println("ThreadEx3 run");
        //Thread 참조객체를 불러와서 해당객체의 메소드를 사용
        System.out.println(Thread.currentThread().getName());
    }




    public static void main(String[] args) {
        ThreadEx3 thread = new ThreadEx3();
        Thread thread1 = new Thread(thread);
        //Thread 클래스의 run() 호출 -> target.run() 호출 = threadEx3.run() 호출
        thread1.start();
        Thread thread2 = new Thread(thread);
        thread2.start();


    }


}
