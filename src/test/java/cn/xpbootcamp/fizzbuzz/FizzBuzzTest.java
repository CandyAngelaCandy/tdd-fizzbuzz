package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void should_return_Fizz_if_number_is_divisible_by_3(){
        assertEquals(new FizzBuzz().getNumberToFizzBuzzResult(3),"Fizz");
    }

}