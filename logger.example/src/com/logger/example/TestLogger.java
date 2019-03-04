package com.logger.example;

import com.another.messenger.SendMessage;

import java.util.logging.Logger;

public class TestLogger {

    private static final Logger LOGGER = Logger.getLogger(TestLogger.class.getName());
    public static void main(String[] args) {

        SendMessage sendMessage=new SendMessage();
        LOGGER.info("Running test application..");

        System.out.println(sendMessage.sendMessage());

    }

}
