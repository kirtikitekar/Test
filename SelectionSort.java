package com.home;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = {20,35,-15,7,55,1,-22};
        for(int unsortedArrayIndex = arr.length-1; unsortedArrayIndex > 0; unsortedArrayIndex--)
        {
            int largestNumberIndex = 0;
            for(int currentIndex = largestNumberIndex+1; currentIndex < unsortedArrayIndex; currentIndex++)
            {
                if(arr[currentIndex] > arr[largestNumberIndex])
                    largestNumberIndex = currentIndex;
            }
            int temp = arr[largestNumberIndex];
            arr[largestNumberIndex] = arr[unsortedArrayIndex];
            arr[unsortedArrayIndex] = temp;
        }

        for(int index = 0; index < arr.length; index++)
        {
            System.out.println(arr[index]);
        }
    }
}
