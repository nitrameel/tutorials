package com.mlee;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("result is now " + result);
        result++;
        System.out.println("result is now " + result);
        result--;
        System.out.println("result is now " + result);

        result += 2;
        System.out.println("result is now " + result);
        result *= 10;
        System.out.println("result is now " + result);
        result -= 10;
        System.out.println("result is now " + result);
        result /= 10;
        System.out.println("result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than 2nd top score and less than 100");

        double firstValue = 20;
        double secondValue = 80;

        double newResult = (firstValue + secondValue) * 25;
        System.out.println("New Result = " + newResult);
        double myRemainder = newResult % 40;

        if (myRemainder <= 20)
            System.out.println("Total was over the limit");






    }
}
