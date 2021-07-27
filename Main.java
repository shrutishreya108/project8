package com.company;

import java.util.Scanner;

public class Main {




        public static void main(String[] args){
        int numberToCheck;
        int remainder;
        boolean isPrime = true;
        System.out.println("Please insert any number:");
        Scanner in = new Scanner((System.in));
        numberToCheck = in.nextInt();
            for(int i=2;i<=numberToCheck/2;i++)
            {
                remainder=numberToCheck%i;

                //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
                if(remainder==0)
                {
                    isPrime=false;
                    break;
                }
            }
            // Check value true or false,if isprime is true then numberToCheckber is prime otherwise not prime
            if(isPrime)
                System.out.println(numberToCheck + " is a Prime number");
            else
                System.out.println(numberToCheck + " is not a Prime number");
        }
}




