package advance.ch07.sec10.exam02;

public abstract class Animal {
    public void breathe(){
        System.out.println("breathing");
    }

    public abstract void sound();
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
