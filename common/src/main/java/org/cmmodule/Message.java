package org.cmmodule;

import java.time.LocalDateTime;

public class Message {
    private String author;
    private String text;
    private LocalDateTime dateTime;

    public Message(String author, String text, LocalDateTime dateTime) {
        this.author = author;
        this.text = text;
        this.dateTime = dateTime;
    }
}
