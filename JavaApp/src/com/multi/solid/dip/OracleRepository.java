package com.multi.solid.dip;

public class OracleRepository implements UserRepository{

    @Override
    public void save(String data) {
        System.out.println("Saving data to Oracle :" + data);
    }
}
