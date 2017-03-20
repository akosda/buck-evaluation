package com.example;

import com.example.Hello;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloTest {

    @Test
    public void testSum() {
        Hello h = new Hello();
        assertEquals(3, h.sum(1,2));
    }
}
