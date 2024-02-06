package javaBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JavaBasicsTests {

    int sum = 10;

    public static void main(String[] args) {

        System.out.println("Hello Sebis");

    } // End main

    @Test
    public void displayConsole() {
        System.out.println("Hello TestNG");
        Reporter.log("Hello world", true);
        sum = sum + 1;
        Reporter.log("The sum is: " + sum, true);
        sum = sum + sum;
        Reporter.log("The recurrent su is: " + sum, true);





    } // End displayConsole


    @Test
    public void basicOperations() {

        int num1 =20;
        int num2 = 2;

        double  sumResult = num1 + num2;
        Reporter.log("Sum Result is " + sumResult,true);

        double subtractionResult = num1 - num2;
        Reporter.log("Subtraction Result is " + subtractionResult,true);

        double multiplicationResult = num1 * num2;
        Reporter.log("Multiplication Result is " + multiplicationResult, true);

        double divisionResult = num1 / num2;
        Reporter.log("Division Result is " + divisionResult,true);


    } // End basicOperations


}
