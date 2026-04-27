package ch11.sec03.exam01;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }

    }
}
