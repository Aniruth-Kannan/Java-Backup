package fsTraining;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

class abs {

    String a1;

    public static String one(){
        return "Hi all!";
    }

    public abs(String sampleConst){
        a1 = sampleConst;
        //System.out.println(a1);
    }

    public void testMethod() {
        //System.out.println(a1);

    }
    public static String getPropertyValue(String propKey) {
        String dataValue = null;
        InputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream("src\\testData.properties");
            prop = new Properties();
            prop.load(fis);
            dataValue = prop.getProperty(propKey);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dataValue;
    }

    //public static void instVariableTest(){
        //System.out.println(a1);
    //}

    public static void main(String args[]){
        System.out.println("Hello ALl");
        String x = getPropertyValue("userName");
        System.out.println(x);
    }

    class v{}

    

}
