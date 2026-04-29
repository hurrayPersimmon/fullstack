package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((x, y)
            -> System.out.println(x+" do the "+y ));

        person.action1((x,y)
            -> System.out.println(x+" don't do the "+y));

        person.action2(x -> System.out.println("say "+ x));
        person.action2(x -> System.out.println("yell "+ x));

    }

}
