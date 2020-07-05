package inta;

public class bubbleSort_13 {

    public static void main(String args[]){
        int arr[] = {1,6,2,3,5,19,4};
        int len = arr.length;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
