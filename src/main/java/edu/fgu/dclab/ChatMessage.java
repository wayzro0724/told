package edu.fgu.dclab;

import java.util.Date;


public class ChatMessage extends AbstractMessage {
    public final String MESSAGE;

    public ChatMessage(String source, String message)  {
        this.source = source;
        this.MESSAGE = message;
        Date date = new Date();
        System.out.println(date.toString());

    }

    public int getType() {
        return Message.CHAT;
    }
}
