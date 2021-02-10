package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
  // TODO Get input from args or user
  // TODO loop from 1 to upper limit (input) & invoke .getFizzBuzz  iteratively
  }

  public static String getFizzBuzz(int inputNum) {
    String result;
    if (inputNum % 15 == 0) {
      result = "FizzBuzz!";
    } else if (inputNum % 5 ==0) {
      result = "Buzz!";
    } else if (inputNum % 3 == 0) {
      result = "Fizz!";
    } else {
      result = Integer.toString(inputNum);
    }
    return  result;

  }
}
