package com.clmodule;

import org.cmmodule.Message;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {
        Message message = new Message("qwe", "client message", LocalDateTime.now());
    }
}
