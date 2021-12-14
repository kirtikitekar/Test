package com.home;

public class LinearSearch {

    public static int search(int arr[], int find){
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == find)
                return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
     int arr[] = new int[] {10,30,22,0,5,33,17};
     int find = 0;
     int result = search(arr, find);
     if(result == -1){
         System.out.println("Not Found");
     }
     else
         System.out.println("Found");
     }
}
