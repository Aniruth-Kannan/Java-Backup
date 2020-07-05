package javaAssignment;

import java.util.Scanner;

public class topic3_As2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String student1, student2;
        float averageSt1, averageSt2;
        int sum1 = 0; int sum2 = 0;
        String[] st1Marks = new String[3];
        String[] st2Marks = new String[3];
        int[] st1MarksInt = new int[3];
        int[] st2MarksInt = new int[3];
        System.out.println("Enter the name for student1: ");
        student1 = sc.nextLine();
        System.out.println("Enter the name for student2: ");
        student2 = sc.nextLine();
        for(int i = 0; i<3; i++){
            System.out.println("Enter the marks for student1 for subject" + (i+1));
            st1Marks[i] = sc.nextLine();
            try{
                st1MarksInt[i] = Integer.parseInt(st1Marks[i]);
            }
            catch(NumberFormatException e){
                System.out.println("Exception occured: " +e.getMessage());
                System.exit(0);
            }
        }
        for(int i = 0; i<3; i++){
            System.out.println("Enter the marks for student2 for subject" + (i+1));
            st2Marks[i] = sc.nextLine();
            try{
                st2MarksInt[i] = Integer.parseInt(st2Marks[i]);
            }
            catch(NumberFormatException e){
                System.out.println("Exception occured: " +e.getMessage());
                System.exit(0);
            }
        }
        for(int i = 0; i<3; i++){
            sum1 = st1MarksInt[i] + sum1;
        }
        for(int i = 0; i<3; i++){
            sum2 = st2MarksInt[i] + sum2;
        }
        averageSt1 = sum1/3;
        averageSt2 = sum2/3;
        System.out.println("Sum1: " + sum1 + " sum2: " + sum2);
        System.out.println("Average of student1: " + averageSt1 + " Average of student2: " + averageSt2);

    }
}
