package javaAssignment;

import java.util.Random;

public class topic4_As1 extends Thread{


    public int assignment7(int noToFindFactorial){
        if (noToFindFactorial==1) {
            return 1;
        }
        else {
            return noToFindFactorial*=assignment7(noToFindFactorial-1);
        }
    }

    public synchronized void run(){
        Random rn = new Random();
        int no = rn.nextInt(((20-1)+1) + 1);
        System.out.println("Number: " + no);
        System.out.println("Factorial of the no is: " + assignment7(no));
    }


    public static void main(String args[]){

        topic4_As1 Thread1 = new topic4_As1();
        topic4_As1 Thread2 = new topic4_As1();
        topic4_As1 Thread3 = new topic4_As1();
        topic4_As1 Thread4 = new topic4_As1();
        topic4_As1 Thread5 = new topic4_As1();
        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread4.start();
        Thread5.start();
    }


}
