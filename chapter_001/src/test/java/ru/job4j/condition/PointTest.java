package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;


public class PointTest  {

    @Test
    public void distance() {
        int x1 = 4;
        int x2 = 2;
        int y1 = 1;
        int y2 = 1;
        double expected = 3.16;
        double delta = 0.16;
        double out = Point.distance(x1,x2,y1,y2);
        Assert.assertEquals(expected, out,delta);
    }
}