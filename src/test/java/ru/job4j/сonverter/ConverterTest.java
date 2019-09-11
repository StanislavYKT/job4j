package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

    public class ConverterTest {

        @Test
        public void rubleToEuro() {
            int in = 140;
            int expected = 2;
            int out = Converter.rubleToEuro(in);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void rubleToDollar() {
            int in = 120;
            int expected = 2;
            int out = Converter.rubleToDollar(in);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void EurotoRuble() {
            int in = 3;
            int expected = 210;
            int out = Converter.EurotoRuble(in);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void DollartoRuble() {
            int in = 2;
            int expected = 120;
            int out = Converter.DollartoRuble(in);
            Assert.assertEquals(expected, out);
        }








    }




