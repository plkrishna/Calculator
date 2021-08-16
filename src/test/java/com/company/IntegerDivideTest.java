package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerDivideTest {

    @Test
    public void divide() {
        Assert.assertEquals(20/3,IntegerDivide.divide(20,3));
    }
}