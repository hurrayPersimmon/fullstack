package ch09.sec07.exam02;

public class Home {
    private RemoteControl remoteControl = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("turn on TV");
        }

        @Override
        public void turnOff() {
            System.out.println("turn off TV");

        }
    };

    public void use1(){
        remoteControl.turnOn();
        remoteControl.turnOff();
    }

}
