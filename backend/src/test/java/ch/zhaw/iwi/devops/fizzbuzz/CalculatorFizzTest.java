package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorFizzTest {
    @Test
    public void testMultiplyFizz() {
        CalculatorFizz fizzBuzz = new CalculatorFizz();
        Assertions.assertEquals("Fizz", fizzBuzz.multiply(1, 9));
        Assertions.assertEquals("Fizz", fizzBuzz.multiply(2, 9));
        Assertions.assertEquals("Fizz", fizzBuzz.multiply(3, 9));
    }

    @Test
    public void testMultiplyBuzz() {
        CalculatorFizz fizzBuzz = new CalculatorFizz();
        Assertions.assertEquals("Buzz", fizzBuzz.multiply(8, 7));
    }

    @Test
    public void testMultiplyFizzBuzz() {
        CalculatorFizz fizzBuzz = new CalculatorFizz();
        Assertions.assertEquals("FizzBuzz", fizzBuzz.multiply(3, 7));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.multiply(3, 7));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.multiply(6, 7));

    }

    @Test
    public void testMultiplyNumbers() {
        CalculatorFizz fizzBuzz = new CalculatorFizz();
        Assertions.assertEquals("2", fizzBuzz.multiply(1, 2));
        Assertions.assertEquals("4", fizzBuzz.multiply(2, 2));
        Assertions.assertEquals("8", fizzBuzz.multiply(4, 2));
    }
}
