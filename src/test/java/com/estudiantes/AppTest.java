package com.estudiantes;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAppRuns() {
        App.main(new String[]{});
        assertTrue(true);
    }

    @Test
    public void testSum() {
        int a = 2;
        int b = 3;
        int resultado = a + b;
        assertEquals(5, resultado);
    }
}
