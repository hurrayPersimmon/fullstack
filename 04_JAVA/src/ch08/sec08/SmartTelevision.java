package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable{

    @Override
    public void turnOff() {
        System.out.println("SmartTelevision: turnOff");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartTelevision: turnOn");

    }

    @Override
    public void search(String url) {
        System.out.println(url+" is searching");

    }
}
