package com.mathOperations.calculation;

import java.util.Random;

public class Calculation {

    public void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }
   public void OddOrEven (int n){

       if (n % 2 == 0)
           System.out.println("Number "+n+" is even.");
       else
           System.out.println("Number "+n+" is odd.");
   }
     public void sequareRoot(int num){

         System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));
     }

    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }



}
