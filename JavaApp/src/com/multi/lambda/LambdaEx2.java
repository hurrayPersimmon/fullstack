package com.multi.lambda;

public class LambdaEx2 {

    public static void main(String[] args) {
        Task task = new Task() {
            @Override
            public void run() {
                System.out.println("This is a task");
            }
        };
        task.run();

        Task task1 = () -> System.out.println("This is a task1");
        task1.run();
    }

}
