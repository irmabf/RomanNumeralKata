package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void shouldConvert1ToI() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        String result = converter.convert(1);
        assertEquals("I", result);
    }
    @Test
    public void shouldConvert2ToII() {
        RomanNumeralsConverter converter = new RomanNumeralsConverter();
        String result = converter.convert(2);
        assertEquals("II", result);
    }
}
