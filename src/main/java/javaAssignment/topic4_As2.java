package javaAssignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class topic4_As2 extends Thread{
    public void run(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    public static void main(String args[]){
        for(int i=0; i<=10; i++) {
            topic4_As2 thread = new topic4_As2();
            thread.start();
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Exception occured: " + e.getMessage());
            }
        }

    }

}
