package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerAddTest {

    @Test
    public void add() {
        Assert.assertEquals(20+30,IntegerAdd.add(20,30));
    }
}