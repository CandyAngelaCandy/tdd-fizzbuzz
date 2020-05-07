package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {

    public String getNumberToFizzBuzzResult(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 7 == 0) {
            return "Whizz";
        }
        return Integer.toString(number);
    }
}
