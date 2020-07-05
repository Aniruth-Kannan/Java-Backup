package com;

public class threadTest extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String args[]){
        threadTest thread = new threadTest();
        thread.start();

    }
}
