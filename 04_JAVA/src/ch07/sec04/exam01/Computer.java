package ch07.sec04.exam01;

public class Computer extends Calculator{
    private static final double PI = Math.PI;

    @Override
    public double areaCircle(double radius) {
        super.areaCircle(radius);
        return PI * radius * radius;
    }

}
