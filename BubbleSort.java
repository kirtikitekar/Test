package com.home;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = new int[7];
        arr[0] = 11;
        arr[1] = 35;
        arr[2] = -22;
        arr[3] = 7;
        arr[4] = 1;
        arr[5] = -11;
        arr[6] = 17;


        for (int unsortedArrayIndex = arr.length -1; unsortedArrayIndex > 0; unsortedArrayIndex--)
        {
            for(int currentIndex = 0; currentIndex < unsortedArrayIndex; currentIndex++)
            {
                if(arr[currentIndex] > arr[currentIndex+1])
                {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex+1];
                    arr[currentIndex+1] = temp;
                }
            }
        }

        for(int index= 0; index < arr.length; index++)
        {
            System.out.println(arr[index]);
        }
    }
}
