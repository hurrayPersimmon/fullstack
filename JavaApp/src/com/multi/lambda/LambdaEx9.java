package com.multi.lambda;

class User {
    String name;

    public User(String name) {
        this.name = name;
    }

}

@FunctionalInterface
interface Creator {
    User create(String name);
}

public class LambdaEx9 {

    public static void main(String[] args) {
        Creator creator = (String n) -> new User(n);
        Creator creator1 = User::new;

        System.out.println(creator1.create("a").name);
        System.out.println(creator1.create("b").name);
    }



}
