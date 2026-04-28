package advance.ch15.sec05.exam03;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    @Override
    public int compareTo(@NotNull Person o) {
        return Integer.compare(this.age, o.age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
