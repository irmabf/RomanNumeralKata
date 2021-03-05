package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    RomanNumeralsConverter converter;
    @Before
    public void setUp() throws Exception {
       converter  = new RomanNumeralsConverter();
    }

    @Test
    public void shouldConvert1ToI() {
        String result = converter.convert(1);
        assertEquals("I", result);
    }
    @Test
    public void shouldConvert2ToII() {
        String result = converter.convert(2);
        assertEquals("II", result);
    }
    @Test
    public void shouldConvert3ToIII() {
        String result = converter.convert(3);
        assertEquals("III", result);
    }
}
