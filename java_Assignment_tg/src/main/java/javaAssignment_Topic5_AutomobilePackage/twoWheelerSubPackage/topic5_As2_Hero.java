package javaAssignment_Topic5_AutomobilePackage.twoWheelerSubPackage;

import javaAssignment_Topic5_AutomobilePackage.*;

public class topic5_As2_Hero extends javaAssignment_Topic5_AutomobilePackage.topic5_As2_Vehicle {
    static topic5_As2_Vehicle topic5_As2_Vehicle = new topic5_As2_Hero();
    static topic5_As2_Hero topic5_As2_Hero = new topic5_As2_Hero();
    public String modelName(String modelName1){
        return modelName1;
    }
    public String registrationNumber(String registrationNumber1){
        return registrationNumber1;
    }
    public String ownerName(String ownerName1){
        return ownerName1;
    }

    public int speed(int speed1){
        return speed1;
    }

    public void radio(double channel){
        System.out.println("Channel no: " + channel + " is set");
    }

    public static void main(String args[]){
        System.out.println("Model Name: " + topic5_As2_Vehicle.modelName("Yamaha"));
        System.out.println("Registeration number: " + topic5_As2_Vehicle.registrationNumber("CA 1234"));
        System.out.println("Owner Name: " + topic5_As2_Vehicle.ownerName("Viktor"));
        System.out.println("Speed: " + topic5_As2_Hero.speed(20));
        topic5_As2_Hero.radio(91.1);
    }

}
