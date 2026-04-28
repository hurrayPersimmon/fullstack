package advance.ch15.sec05.exam04;

public class Fruit {

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String name;
    public int price;

    @Override
    public String toString() {
        return "Fruit{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
