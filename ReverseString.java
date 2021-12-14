package com.home;

public class ReverseString {
    public static void main(String[] args) {
        {
            int rev = reverse(1534236469);
        }
    }

    public static int reverse(int x) {

        if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE)
            return 0;
        int num = 0;
        while (x != 0) {
            num = num * 10 + x % 10;
            x = x / 10;

        }
        return num;
    }
}
