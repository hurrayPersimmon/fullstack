package com.multi.inheritance;

public class InheritanceBasicExample {

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.name = "Minsu";
        developer.employeeId = 101;
        developer.mainLanguage = "java";

        developer.goToWork();
        developer.showInfo();
        developer.coding();

    }


}
