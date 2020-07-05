package javaAssignment;

public class topic4_As3_Employee {

    static String eName,eId,eSalary;

    public topic4_As3_Employee(String eName1, String eId1, String eSalary1){
        eName = eName1;
        eId = eId1;
        eSalary = eSalary1;
    }

    static public void displayDetails(){
        System.out.println("Ename: " + eName + " eId: " + eId + " eSalary: " + eSalary);
    }
}
