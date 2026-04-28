package com.multi.thread;

import java.util.Comparator;

public class SynchronizedThread0 implements Runnable {

    private int money = 10000;

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void drawMoney(int howmoney) {
        if(getMoney()<=0) {
            return;
            //System.out.println("잔액이 없습니다 ");
        }else {
            this.money-=howmoney;
            System.out.println(Thread.currentThread().getName()+"잔액:"+this.getMoney()+"남았습니다");
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //System.out.println("Run"+ Thread.currentThread().getName());
        synchronized(this) {
            for(int i=1;i<=5;i++) {//synchronized가 없으면 동기화 문제 발생
                try {
                    Thread.sleep(1000);
                    drawMoney(1000);
                    //exception 발생 가능
                    if(getMoney()==8000||getMoney()==6000||getMoney()==4000||getMoney()==2000) {
                        this.wait();// ㅣlock을 해제하고 waitPool로 이동한다
                    }else {
                        this.notify();//waitPool에 있는 객체를 lockPool로 이동한다
                    }

                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }

            }
        }

    }//run

    public static void main(String[] args) {
        SynchronizedThread0 atm = new SynchronizedThread0();
        Thread mother = new Thread(atm);
        Thread son = new Thread(atm);
        mother.start();
        son.start();

    }
}
