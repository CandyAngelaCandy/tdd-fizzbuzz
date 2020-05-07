package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void should_return_Fizz_if_number_is_divisible_by_3(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(3),"Fizz");
    }

    @Test
    void should_return_Buzz_if_number_is_divisible_by_5(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(5),"Buzz");
    }

    @Test
    void should_return_Whizz_if_number_is_divisible_by_7(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(7),"Whizz");
    }

    @Test
    void should_return_FizzBuzz_if_number_is_divisible_by_3_and_5(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(15),"FizzBuzz");
    }

}