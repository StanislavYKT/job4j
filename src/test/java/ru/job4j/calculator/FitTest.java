package ru.job4j.calculator;

import org.junit.Assert;
        import org.junit.Test;


public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        double delta = 0.5;
        Assert.assertEquals(expected, out,delta);
    }
    @Test
    public void womanWeight() {
        double in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        double delta = 0.5;
        Assert.assertEquals(expected, out,delta);
    }
}