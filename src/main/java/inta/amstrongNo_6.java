package inta;

public class amstrongNo_6 {
    public static void main(String args[]){
        int x = 123;
        int xDuplicate = x;
        int cube =0; int temp;
        while(x>0){
            temp = x % 10;
            cube = (temp*temp*temp)+cube;
            x = x / 10;
        }
        if(cube == xDuplicate){
            System.out.println("The number " + xDuplicate + " is a amstrong no");
        }
        else{
            System.out.println("The number " + xDuplicate + " is not a amstrong no");
        }
    }
}
