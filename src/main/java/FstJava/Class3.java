package FstJava;
//single inheritance and abstraction
public class Class3 extends AbsClass1{
//multiple inheritance and abstraction
public class Class3 implements InterfaeClass1{

    @Override
    public void addNo(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is " + (a+b));
    }

    @Override
    public void subNo(int a, int b) {

    }

    public static void main(String args[]){
        InterfaeClass1 InterfaeClass1 = new Class3();
        InterfaeClass1.addNo(20,30);

    }
/*
    @Override
    void addNo(int a, int b) {

    }*/
}
