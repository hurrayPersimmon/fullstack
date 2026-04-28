package advance.ch14.exam;

public class ThreadExample {

    public static void main(String[] args) {
        Thread movieThread = new MovieThread();
        Runnable musicRunnable = new MusicRunnable();
        movieThread.start();
        musicRunnable.run();
    }

}
