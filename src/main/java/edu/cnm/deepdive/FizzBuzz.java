package edu.cnm.deepdive;

import java.util.Scanner;

public class FizzBuzz {

  public static void main(String[] args) {
    int upperLimit;
    if (args.length > 0) {
      upperLimit = Integer.parseInt(args[0]);
      emitResults(upperLimit);
    } else {
      do {
        upperLimit = getUpperLimit();
        emitResults(upperLimit);
      } while (upperLimit > 0);
    }
  }

  private static void emitResults(int upperLimit) {
    for (int i = 1; i <= upperLimit; i++) {
      System.out.println(getFizzBuzz(i));
    }
  }

  public static String getFizzBuzz(int inputNum) {
    String result;
    if (inputNum % 15 == 0) {
      result = "FizzBuzz!";
    } else if (inputNum % 5 == 0) {
      result = "Buzz!";
    } else if (inputNum % 3 == 0) {
      result = "Fizz!";
    } else {
      result = Integer.toString(inputNum);
    }
    return result;
  }

  private static int getUpperLimit() {
    int result;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Please enter a positive upper limit number:");
      result = scanner.nextInt();
    } while (result < 0);
    return result;
  }
}
