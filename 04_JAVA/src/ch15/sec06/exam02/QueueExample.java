package ch15.sec06.exam02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "tom"));
        messageQueue.offer(new Message("sendSMS", "jennie"));
        messageQueue.offer(new Message("sendKakaotalk", "winter"));

        Arrays.sort()

        while(!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch(message.command) {
                case "sendMail":
                    System.out.println(message.to + " receive mail");
                    break;
                case "sendSMS":
                    System.out.println(message.to + " receive SMS message.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + " receive kakaotalk message.");
                    break;
            }
        }
    }


}
