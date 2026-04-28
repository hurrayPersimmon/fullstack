package com.multi.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person <T extends Comparable<T>> implements Comparable<Person<T>> {

    private T age;

    public Person(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
            "age=" + age +
            '}';
    }

    public void setAge(T age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person<T> tPerson) {
        return this.age.compareTo(tPerson.getAge());
    }

    public static void main(String[] args) {
        Person<Integer> person = new Person<Integer>(25);
        Person<Integer> person2 = new Person<Integer>(30);

        if(person.compareTo(person2) < 0) {
            System.out.println("person.compareTo(person2) "+person.compareTo(person2));
            System.out.println("person is smaller than person2");
        }else if (person.compareTo(person2) == 0) {
            System.out.println("person.compareTo(person2) "+person.compareTo(person2));
            System.out.println("person is equal to person2");
        } else {
            System.out.println("person.compareTo(person2) "+person.compareTo(person2));
            System.out.println("person is bigger to person2");
        }
        List<Person<Integer>> list = new ArrayList<>();
        list.add(new Person<>(40));
        list.add(new Person<>(20));
        list.add(new Person<>(30));

        System.out.println("정렬 전:");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("정렬 후:");
        System.out.println(list);

        System.out.println();

        // 내림차순
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("내림차순 정렬:");
        System.out.println(list);

        System.out.println();



    }
}
