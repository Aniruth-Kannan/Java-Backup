package javaAssignment;

import java.util.HashMap;

public class topic4_As4 {

    public static void main(String args[]){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Aniruth","1234567890");
        map.put("Kannan","09876543211");
        String name,phNo;
        name = "Aniruth";
        System.out.println("The phone number of " + name + " is: " + map.get(name));
    }
}
