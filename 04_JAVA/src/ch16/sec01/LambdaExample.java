package ch16.sec01;

public class LambdaExample {

    public static void main(String[] args) {
        action(((x, y) -> System.out.println(x + " + " + y + " = " + (x + y) )));
        action(((x, y) -> System.out.println(x + " - " + y + " = " + (x - y) )));

    }

    public static void action(Caculable calculable){
        int x = 10;
        int y = 20;
        calculable.caculate(x, y);
}

}
