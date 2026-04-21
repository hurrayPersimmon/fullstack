package com.multi.inheritance;

public class Developer extends Employee {

    public String mainLanguage;
    public void coding(){
        System.out.println(this.name + " develop by" +this.mainLanguage);

    }


}
