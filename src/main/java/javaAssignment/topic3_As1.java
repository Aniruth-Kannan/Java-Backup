package javaAssignment;

import java.util.Scanner;

public class topic3_As1 {
    public static void main(String args[]){
        String name; int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the age: ");
        age = sc.nextInt();
        if(age<=18 || age>60){
            System.out.println("Age entered should be greater than or equal to 18 and less than 60");
            System.exit(0);
        }
        else{
            System.out.println("Execution completed with 0 errors");
        }
    }
}
