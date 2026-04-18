package com.multi.oop;

//객체 = 사물 그 자체
//객체 = data with functions.
public class Person {
    private String name;
    private int age;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;

    }

    public int getAge() {
        return age;
    }

    public void setAge(Person this, int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double height;
//    private static final String nation = "Korea";

    public Person(){

    }

    //static은 로딩할 때, 생성된다.

    public static void main(String[] args) {
//        int data;
//
//        Person person = new Person();
//        new Person().name = "민서";
//        System.out.println(new Person().name);

        Person person1 = new Person();
    }



}
