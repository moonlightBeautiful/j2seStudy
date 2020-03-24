package com.ims.c01basic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple QRCodeApp.
 */
public class AppTest {
    /**
     * Rigorous ColorTest :-)
     */
    @Test
    public void test() {
        String s = "abc,";
        String[] ss = s.split(",");
        for(String temp : ss){
            System.out.println(temp);
        }

    }
}
