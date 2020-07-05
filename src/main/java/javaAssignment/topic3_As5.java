package javaAssignment;

public class topic3_As5 {
    public static void main(String args[]){
        String str = "Helo All";
        Character charToCount = 'e';
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == charToCount){
                count++;
            }
        }
        System.out.println("no.of occurrences of " +charToCount+ " is: " + count );
    }
}
