package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {
    @Test
    void should_return_2_when_say_2_given_the_number_is_not_divisible_by_3_or_5_or_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(2, fizzBuzz.sayNumber(2));
    }

    @Test
    void should_return_Fizz_when_say_3_given_the_number_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.sayNumber(3));
    }

    @Test
    void should_return_Buzz_when_say_5_given_the_number_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.sayNumber(5));
    }
}
