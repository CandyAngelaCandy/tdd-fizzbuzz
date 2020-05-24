package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {
    @Test
    void should_return_2_when_say_2_given_the_number_is_not_divisible_by_3_or_5_or_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(2, fizzBuzz.sayNumber(2));
    }
}
