package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        int length = (p / 2)/k ;
        int width = k * length;
        int result1 = length * width;
        return  result1;
    }

    public static void main(String[] args) {
        int result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}