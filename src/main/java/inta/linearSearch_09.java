package inta;

public class linearSearch_09 {

    public static void main(String args[]){
        int arr[] = {1,2,3,6,4,8};
        int search = 9;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == search){
                System.out.println("The number is present in position: " + (i+1));
            }
            else if(i==(arr.length)-1){
                System.out.println("Element is not present");
            }
        }
    }

}
