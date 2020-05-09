package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {

    public String getNumberToFizzBuzzResult(int number) {
        if(Integer.toString(number).contains("5") && number % 5 == 0){
            return "Buzz";
        }else if(Integer.toString(number).contains("3")){
            return "Fizz";
        } else if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzzWhizz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0 && number % 7 == 0) {
            return "FizzWhizz";
        } else if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 7 == 0) {
            return "Whizz";
        }
        return Integer.toString(number);
    }
}
