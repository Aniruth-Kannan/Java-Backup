package javaAssignment_Topic5_AutomobilePackage.twoWheelerSubPackage;

import javaAssignment_Topic5_AutomobilePackage.*;

public class topic5_As2_Honda extends javaAssignment_Topic5_AutomobilePackage.topic5_As2_Vehicle {
    static topic5_As2_Vehicle topic5_As2_Vehicle = new topic5_As2_Honda();
    static topic5_As2_Honda topic5_As2_Honda = new topic5_As2_Honda();
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

    public int cdPlayer(int volume){
        System.out.println("Cd Palyer Volume " + volume + " is set");
        return volume;
    }

    public static void main(String args[]){
        System.out.println("Model Name: " + topic5_As2_Vehicle.modelName("Yamaha"));
        System.out.println("Registeration number: " + topic5_As2_Vehicle.registrationNumber("CA 1234"));
        System.out.println("Owner Name: " + topic5_As2_Vehicle.ownerName("Viktor"));
        System.out.println("Speed: " + topic5_As2_Honda.speed(20));
        System.out.println("cd Player Volume " + topic5_As2_Honda.cdPlayer(20));
    }
}
