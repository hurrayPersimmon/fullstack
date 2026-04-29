package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(((x, y) -> {
            double result = x+y;
            return result;
        }));

        person.action(LambdaExample::sum);
    }

    public static double sum(double a, double b) {
        return a + b;
    }

}
