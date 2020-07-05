package FstJava;

public class Class1 {
    static String classVariable1 = "I am a class variable";
    String instanceVariable1 = "I am an Instance variable";
    public static void main(String args[]){
        System.out.println("This is the main block");
        //addNo(1,2);
        ///addNo(1,2,3);
        String a = "Hello "; String b = "world";
        int x = 10; int y = 20;
        // + acts as a concat
        System.out.println(a+b);
        // + acts as an addition
        System.out.println(x+y);

    }

    public Class1(int x){
        System.out.println("This is the value of x: " + x);
    }

    public static void addNo(int a, int b){
        System.out.println("Addition of " + a + " and " + b + " is " + (a+b));
    }

    public static void addNo(int a, int b, int c){
        System.out.println("Addition of " + a + " and " + b + c + " is " + (a+b+c));
    }

    static {
        classVariable1 = "";
        System.out.println("This is inside a static block 1");
    }
    static {
        System.out.println("This is inside a static block 2");
    }
    static {
        System.out.println("This is inside a static block 3");
    }





    public static void method1(){
        String str11 = "Hie AALl!";
        int int1 = 100;
        StringBuffer strbuf1 = new StringBuffer();
        /*Class1 class1 = new Class1();
        String x = classVariable1;
        String y = class1.instanceVariable1;*/

        //System.out.println(instanceVariable1);
    }

    public void method2(){
        String x = classVariable1;
    }

    public void method3(){
        method1();
        method2();
    }

/*    public static void method4(){
        method1();
        method2();
    }*/

    //public Class1(int a, String b){}


}
