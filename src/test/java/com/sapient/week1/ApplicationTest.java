package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    public CheckEven app;
    
    @Before
    public  void setup() {
        app = new CheckEven();
    }
    
    
    @Test
    public  void test1_check_int_2() {
        Boolean result = app.check(2);
        assertTrue(result == true);
    }

    @Test
    public  void test2_check_int_3() {
        Boolean result = app.check(3);
        assertTrue(result == false);
    }

    @Test
    public  void test3_check_int_0() {
        Boolean result = app.check(0);
        assertTrue(result == true);
    }

    @Test
    @Ignore
    public  void test4_to_ignore() {
        Boolean result = app.check(4);
        assertTrue(result == true);
    }

   
}