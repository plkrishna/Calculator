package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerMultiplyTest {

    @Test
    public void multiply() {
        Assert.assertEquals(5*3,IntegerMultiply.multiply(5,3));
    }
}