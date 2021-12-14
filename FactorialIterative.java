package com.home;

public class FactorialIterative {

    public static int calculateFactorial(int num)
    {
        int factorial = 1;
        if(num == 0)
            return factorial;
        for(int multiplier = num; multiplier > 0; multiplier--)
        {
            factorial *= multiplier;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
    public static void main(String[] args)
    {
        int  fact = calculateFactorial(5);
        System.out.println(fact);
    }
}
