package advance.ch15.sec05.exam03;

import java.util.ArrayList;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("tom", 35));
        personArrayList.add(new Person("jennie", 25));
        personArrayList.add(new Person("karina", 31));

        personArrayList.sort(Person::compareTo);
        for (Person person : personArrayList) {
            System.out.println(person.toString());
        }

    }

}
