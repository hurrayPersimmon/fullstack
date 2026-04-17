package ch06.sec08.exam03;

public class Car {

    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("no gas. please put gas.");
            return false;
        }
        System.out.println("gas is left");
        return true;
    }

    void run() {
        if(isLeftGas()){
            System.out.println("running start.");
            while (gas > 0) {
                System.out.println("running... gas: " + gas--);
            }
            System.out.println("stop running. gas: " + gas);

        }
    }


}
