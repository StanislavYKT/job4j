package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return  value / 60;
    }

    public static int EurotoRuble(int value) {
        return
                value * 70;
    }

    public static int DollartoRuble(int value) {

        return  value * 60;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(120);
        int RubleE = EurotoRuble(3);
        int RubleD = DollartoRuble(3);
        System.out.println("12- rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println("3 Euro are " + RubleE + " Ruble.");
        System.out.println("3 Dollar are " + RubleD + " Ruble.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}