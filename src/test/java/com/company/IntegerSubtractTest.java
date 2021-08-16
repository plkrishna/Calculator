package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSubtractTest {

    @Test
    public void subtract() {
        Assert.assertEquals(20-30,IntegerSubtract.subtract(20,30));
    }
}