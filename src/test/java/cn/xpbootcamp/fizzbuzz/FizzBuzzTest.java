package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void should_return_FizzBuzzWhizz_when_count_given_number_is_not_divisible_by_3_or_5_or_7() {
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(2), "2");
    }

    @Test
    void should_return_Fizz_when_count_given_number_is_divisible_by_3(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(3),"Fizz");
    }

    @Test
    void should_return_Buzz_when_count_given_number_is_divisible_by_5(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(5),"Buzz");
    }

    @Test
    void should_return_Whizz_when_count_given_number_is_divisible_by_7(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(7),"Whizz");
    }

    @Test
    void should_return_FizzBuzz_when_count_given_number_is_divisible_by_3_and_5(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(15),"FizzBuzz");
    }

    @Test
    void should_return_FizzWhizz_when_count_given_number_is_divisible_by_3_and_7(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(21),"FizzWhizz");
    }

    @Test
    void should_return_BuzzWhizz_when_count_given_number_is_divisible_by_5_and_7(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(35),"BuzzWhizz");
    }

    @Test
    void should_return_FizzBuzzWhizz_when_count_given_number_is_divisible_by_3_and_5_and_7(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(105),"FizzBuzzWhizz");
    }

    @Test
    void should_return_Fizz_when_count_given_number_contains_3() {
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(13), "Fizz");
    }

}