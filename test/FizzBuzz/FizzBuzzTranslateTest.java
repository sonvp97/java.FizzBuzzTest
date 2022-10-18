package FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void testFizzBuzz() {
        String string = "23";
        String excuted = "Fizz";
        String resuilt = FizzBuzzTranslate.getFizzBuzz(string);
        assertEquals(resuilt,excuted);
    }
    @org.junit.jupiter.api.Test
    void testFizzBuzz1() {
        String string = "24";
        String excuted = "Fizz";
        String resuilt = FizzBuzzTranslate.getFizzBuzz(string);
        assertEquals(resuilt,excuted);
    }
    @org.junit.jupiter.api.Test
    void testFizzBuzz2() {
        String string = "22";
        String excuted = "hai hai";
        String resuilt = FizzBuzzTranslate.getFizzBuzz(string);
        assertEquals(resuilt,excuted);
    }
}