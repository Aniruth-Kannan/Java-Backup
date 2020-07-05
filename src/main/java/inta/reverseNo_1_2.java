package inta;

public class reverseNo_1_2 {

    public static void main(String args[]){
        int x = 1234;
        String str = Integer.toString(x);
        String reverseStr = new String();
        int reversex;
        char reverseStrArray[] = new char[str.length()];
        int j = 0;
        for(int i=(str.length())-1; i>=0; i--){
            reverseStrArray[j] = str.charAt(i);
            j++;
        }
        reverseStr = String.valueOf(reverseStrArray);
        reversex = Integer.parseInt(reverseStr);
        System.out.println("reverseStrArray: " + reverseStr);


    }
}
