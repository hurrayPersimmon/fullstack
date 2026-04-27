package com.multi.thread;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import lombok.Getter;

public class ThreadEx4 extends Frame {
    @Getter
    Pan pan=new Pan();
    private int x=200,y=20;
    private Message []messages=new Message[5];
    private String []str= {"Java","Oracle","Jsp","Spring","Xml"};
    private MessageThread []mthread=new MessageThread[messages.length];

        public void initString() {
        for (int i = 0; i < messages.length; i++) {
            messages[i]=new Message(20+((i+1)*70), 20, str[i]);
        }
    }


    public class Pan extends Canvas{// Member InnerClass
        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            g.setFont(new Font("굴림", Font.BOLD, 20));

            for (Message message : messages) {
                g.drawString(message.getMsg(), message.getX(), message.getY());
            }


        }
    }//MemberInner영역이다


    public ThreadEx4() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Closing");
                System.exit(0);
            }
        });
        this.setBounds(100, 100, 450, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ThreadEx4();
    }

}
