package com.multi.inheritance;

public class Employee {
    public String name;
    public int employeeId;

    public void goToWork(){
        System.out.println(this.name+" is going to work");
    }

    public void showInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Employee ID: "+this.employeeId);
    }



}
