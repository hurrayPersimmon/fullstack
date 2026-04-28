package advance.ch15.sec05.exam04;

import java.util.ArrayList;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("grape", 3000));
        fruits.add(new Fruit("watermelon", 10000));
        fruits.add(new Fruit("strawberry", 6000));

        fruits.sort(new FruitComparator());

        for(Fruit fruit : fruits) {
            System.out.println(fruit.toString());
        }
    }

}
