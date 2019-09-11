package ru.job4j.condition;
        public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double result = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
             return  result;
        }

        public static void main(String[] args) {
            double result = distance(4, 3, 2, 1);
            System.out.println("result (4, 3) to (2, 1) " + result);
        }

}
