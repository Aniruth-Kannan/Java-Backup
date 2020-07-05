package collectionsPractice;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Properties;

public class practice1 {

    public static void main(String args[]){
        ArrayList <String> x = new ArrayList<>();
        x.add("Aniruth");
        x.add("Kannan");
        x.add("Aniruth");
        LinkedList <Integer> y = new LinkedList<>();
        y.add(1);
        y.add(2);
        y.add(3);
        y.remove(1);
        System.out.println("x: " + x);


        HashMap<String,String> hm1 = new HashMap<String,String>();
        hm1.put("Aniruth","Kannan");
        hm1.put("Aniruth","Kannan1");
        System.out.println(hm1);

    }

    public static Properties readPropertyFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try{
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return prop;
    }
}
