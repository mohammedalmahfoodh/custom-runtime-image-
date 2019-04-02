package com.logger.example;

import com.another.messenger.SendMessage;
import com.userMenue.UserMenue;

import java.util.logging.Logger;

public class TestLogger {

    private static final Logger LOGGER = Logger.getLogger(TestLogger.class.getName());
    public static void main(String[] args) {
       UserMenue userMenue=new UserMenue();
        SendMessage sendMessage=new SendMessage();

        System.out.println(sendMessage.sendMessage());
        LOGGER.info("Running module based application..");
       userMenue.selectUserInput();

    }

}
