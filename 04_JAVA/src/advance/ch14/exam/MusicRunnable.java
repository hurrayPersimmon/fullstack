package advance.ch14.exam;

public class MusicRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("music Start");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
