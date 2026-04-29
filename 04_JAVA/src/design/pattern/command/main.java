package design.pattern.command;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        WorkService workService = new WorkService();

        // Command의 excute와 동일한 매개변수 및 반환자 타입일 경우
        // 람다로 참조 가능
        // Runnable의 run도 똑같이 가능하니까 사실상 runnable을 사용합시다.
        Command[] commands = {
            workService::add,
            workService::open,
            workService::print,
            main::exit
        };

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.print("선택: ");
            int sel = scanner.nextInt();
            commands[sel - 1].execute();
//            commands[sel - 1].run();
        }
    }

    public static void exit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("종료할까요?(Y/n) ");
        String answer = scanner.nextLine();
        scanner.close();
        if(answer.isEmpty() || answer.equalsIgnoreCase("Y") ) {
            System.exit(0);
        }
    }

}
