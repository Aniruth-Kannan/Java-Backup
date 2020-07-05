package javaAssignment;

import java.util.*;


public class topic3_As3 {
    public static void main(String args[]){
        int length = 4;
        int[] no = new int[length];
        int sum = 0;float avg;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<no.length; i++) {
            System.out.println("Enter number: " +(i+1));
            no[i] = (sc.nextInt());
        }

        for(int i = 0; i<5; i++){
            try {
                sum = no[i] + sum;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception occured: " + e.getMessage());
                System.exit(0);
            }
        }
        avg = sum/5;
        System.out.println("Average is: " + avg );
    }
}
