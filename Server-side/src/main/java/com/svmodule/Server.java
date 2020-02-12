package com.svmodule;

import org.cmmodule.Message;

import java.time.LocalDateTime;

public class Server {
    public static void main(String[] args) {
        Message message = new Message("server", "server message", LocalDateTime.now());
    }
}
