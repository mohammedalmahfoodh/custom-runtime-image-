package com.userMenue;

import com.another.messenger.SendMessage;
import com.mathOperations.calculation.Calculation;
import com.mathOperations.privateCalculation.PrivateOperation;


import java.util.Scanner;

public class UserServices {
  SendMessage sendMessage=new SendMessage();
   Calculation calculation =new Calculation();
    PrivateOperation privateOperation=new PrivateOperation();


   public void checkNumberIfPrime(){
       System.out.println("Please enter a number:");
       Scanner userInput = new Scanner(System.in);
       int number = userInput.nextInt();
       calculation.checkPrime(number);

   }

   public void checkNumberIfOdd(){
       System.out.println("Please enter a number:");
       Scanner userInput = new Scanner(System.in);
       int number = userInput.nextInt();
       calculation.OddOrEven(number);
   }

   public void getAmessage(){
       System.out.println(sendMessage.sendMessage());
   }

    public void sequareRoot(){
        System.out.print("Enter an integer number: ");
        Scanner sc=new Scanner(System.in);
        int  num=sc.nextInt();

        System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));
    }


    public void getRandomNumberInRange(){
        System.out.print("Enter min integer number: ");
        Scanner sc=new Scanner(System.in);
        int  min=sc.nextInt();
        System.out.print("Enter max integer number: ");
        int  max=sc.nextInt();
        for (int i = 0; i < 8; i++) {
            System.out.println(calculation.getRandomNumberInRange(min, max));
        }


    }
}
