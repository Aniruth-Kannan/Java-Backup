package inta;

import java.util.Arrays;

public class binarySearch_10 {
    static int search = 5;
    public static void main(String args[]){
        int arr[] = {1,5,8,2,4,10};
        int mid = 0;
        Arrays.sort(arr);
        if((arr.length)/2==0){
            mid = arr.length/2;
        }
        else{
            mid = ((arr.length)-1)/2;
        }
        if(arr[mid] == search){
            System.out.println("Element is present in position: " + (mid-1));
        }
        else if(search>arr[mid]){
            //int arrMid[] =
            //searchMethod();
        }

    }
        public void searchMethod(int [] arrSearch){
        for(int i = 0; i<arrSearch.length; i++){
            if(arrSearch[i] == search){
                System.out.println("Element is present");
            }
            else if(i == (arrSearch.length)-1){
                System.out.println("Element is not present");
            }
        }
        }
}
