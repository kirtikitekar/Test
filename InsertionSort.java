package com.home;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int sorted = 0;

        for(int unsorted = 1; unsorted < arr.length; unsorted ++)
        {
            int key = arr[unsorted];
            sorted = unsorted -1;
                while(sorted >= 0 && arr[sorted] > key ) {
                    arr[sorted+1] = arr[sorted];
                    sorted--;
                }
        arr[sorted+1] = key;
        }
        for(int i =0; i< arr.length; i++)
        System.out.println(arr[i]);
    }
}
