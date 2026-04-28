package ch13.sec02.exam02;

public class HomeAgency implements Rentable{

    Home home = new Home();
    @Override
    public Home rent() {
        return home;
    }
}
