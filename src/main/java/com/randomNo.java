package com;

import java.util.Random;

public class randomNo {

    public static void main(String args[]){
        String randomPhoneNo = null;
        Random rand = new Random();
        double randomNo1 = (Math.random() * ( 900000 - 100000 )) + 100000;
        double randomNo2 = (Math.random() * ( 9000 - 1000 )) + 1000;
        String stnum1 = (Double.toString(randomNo1)).replace("."," ").split(" ")[0];
        String stnum2 = Double.toString(randomNo2).replace("."," ").split(" ")[0];
        randomPhoneNo = stnum1+stnum2;
    }
}
