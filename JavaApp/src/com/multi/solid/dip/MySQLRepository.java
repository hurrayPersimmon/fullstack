package com.multi.solid.dip;

public class MySQLRepository implements UserRepository {

    @Override
    public void save(String data){
        System.out.println("MySQLRepository save : " + data);
    }

}
