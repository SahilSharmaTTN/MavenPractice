package com.sahil;

import org.junit.Assert;
import org.junit.Test;

public class TestingFileTest {

    @Test
    public void testSum(){

        int result = Main.sum(1,2);

        Assert.assertEquals(3,result);
    }
}
