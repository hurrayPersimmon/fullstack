package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        //null에 대한 길이를 나타낼 수 없음. NullPointerException 발생
        try{
            printLength(null);
        }catch(NullPointerException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("[프로그램 종료]");
    }
}
