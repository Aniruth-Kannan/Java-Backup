package javaAssignment;

import java.util.Arrays;

public class topic1{

    public static void main(String args[]){
        assignment1();
        assignment2();
        assignment3(525600);
        assignment4(11);
        assignment5(1234);
        assignment6(new int[]{1,2,3,5,3,7});
        System.out.println("Factorial of the number is " + assignment7(5));
    }

    static void assignment1(){
        System.out.println("Welcome to Java Programming \nAniruth Kannan");
    }

    static void assignment2(){
        int x1,x2,x3,x4;
        x1 = -5 + 8*6;
        x2 = (55+9) % 9;
        x3 = 20 + -3*5 / 8;
        x4 =  5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("x1: " + x1 + "\nx2: " + x2 + "\nx3: " + x3 + "\nx4: " + x4);
    }

    static void assignment3(double minutes){
        double minutesInYear = 525600;
        double years = (minutes/minutesInYear);
        double days = (minutes/60/24) %365;
        System.out.println("Years: " + years + " days: " + days );
    }

    static void assignment4(int monthNo){
        switch(monthNo){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }

    static void assignment5(int fourDigitNo){
        int output,reminder;
        for(output=0 ;fourDigitNo!=0 ;fourDigitNo/=10)
        {
            output+=fourDigitNo%10;
        }
        System.out.println("The sum of all the digits entered is " + output);
    }

    static void assignment6(int[] arrayToFindGreatest){
        Arrays.sort(arrayToFindGreatest);
        int greatestNoPosition = (arrayToFindGreatest.length)-1;
        System.out.println("Greates number in the array is " + arrayToFindGreatest[greatestNoPosition]);
    }

    static int assignment7(int noToFindFactorial){
        if (noToFindFactorial==1) {
            return 1;
        }
        else {
            return noToFindFactorial*=assignment7(noToFindFactorial-1);
        }
    }
}
