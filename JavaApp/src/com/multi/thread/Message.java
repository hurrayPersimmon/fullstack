package com.multi.thread;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Message{
    private int x;
    private int y;
    private String msg;

    @Override
    public String toString() {
        return "Message [x=" + x + ", y=" + y + ", msg=" + msg + "]";
    }

    public Message(int x, int y, String msg) {
        super();
        this.x = x;
        this.y = y;
        this.msg = msg;
    }
}
