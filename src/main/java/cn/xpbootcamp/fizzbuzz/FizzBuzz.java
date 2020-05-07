package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {

    public String getNumberToFizzBuzzResult(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
