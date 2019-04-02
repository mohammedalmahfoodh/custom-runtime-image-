package com.userMenue;

import java.util.Scanner;
import java.util.logging.Logger;

public class UserMenue {

    UserServices userServices=new UserServices();

    public void showInfo (String message){
        final Logger LOGGER = Logger.getLogger(UserMenue.class.getName());
        LOGGER.info(message);
        System.out.println();
        System.out.println();
    }

    private void useroptions(String message){
        showInfo(message);
        System.out.println("*********************************************\n" +
                "Please choose one of the following useroptions: ");
        String messageOptions="1- Check a number if odd \n" +
                "2- Check a number if prime  \n" +
                "3-Get a message from com.another.messenger module\n" +"4-Get square root of an integer\n"+
                "5-generate 8 random integers in a range between min (inclusive) and max (inclusive). \n"+
                "6-exit\n" +
                "********************************************* \n";
        System.out.println(messageOptions);

    }


    public void selectUserInput() {
        useroptions("Running logger application (with modularity feature)...");
        while (true) {

            Scanner userInput = new Scanner(System.in);
            int optionChoosed = userInput.nextInt();

            switch (optionChoosed) {
                case 1:
                    userServices.checkNumberIfOdd();
                    break;
                case 2:
                    userServices.checkNumberIfPrime();
                    break;
                case 3:userServices.getAmessage();
                    break;
                case 4:userServices.sequareRoot();
                    break;
                case 5:userServices.getRandomNumberInRange();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
            }
            System.out.println();
            useroptions("Please choose again other wise enter 6 for exiting the app ......");
        }

    }

    }
