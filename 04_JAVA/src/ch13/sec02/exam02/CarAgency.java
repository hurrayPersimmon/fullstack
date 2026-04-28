package ch13.sec02.exam02;

public class CarAgency implements Rentable{

    Car car = new Car();
    @Override
    public Car rent() {
        return car;
    }
}
