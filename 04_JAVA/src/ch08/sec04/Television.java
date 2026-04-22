package ch08.sec04;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("turn on the television");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the television");
    }

    @Override
    public void setVolume(int volume) {
        if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        }
        else
            this.volume = Math.min(volume, MAX_VOLUME);
        System.out.println("setVolume: " + this.volume);
    }

}
