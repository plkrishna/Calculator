package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void performOperationAndReturnResult() {
        Assert.assertEquals(20+30,Main.performOperationAndReturnResult("20+30"));
        Assert.assertEquals(20-30,Main.performOperationAndReturnResult("20-30"));
        Assert.assertEquals(20/3,Main.performOperationAndReturnResult("20/3"));
        Assert.assertEquals(20*30,Main.performOperationAndReturnResult("20*30"));
    }
}