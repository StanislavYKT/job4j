package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double man = (height - 100) * 1.15;
        return  man;
    }


    public static double womanWeight(double height) {
        double woman = (height - 110) * 1.15;
        return woman;
    }

    public static void main(String[] args) {
        double man = manWeight(185);
        double woman = womanWeight( 170);
        System.out.println("Man 185 is " + man);
        System.out.println("Woman 170 is " + woman);
    }

}

