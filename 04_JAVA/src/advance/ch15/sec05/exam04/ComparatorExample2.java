package advance.ch15.sec05.exam04;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorExample2 {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("grape", 3000));
        fruits.add(new Fruit("watermelon", 10000));
        fruits.add(new Fruit("strawberry", 6000));

        fruits.sort(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return Integer.compare(o1.price, o2.price);
            }
        });

        for(Fruit fruit : fruits) {
            System.out.println(fruit.toString());
        }
    }

}
