package javaBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.Scanner;

public class GradesAverage {

    static double grade1 = -2000;
    static double grade2 = 90;
    double grade3 = 80;
    double grade4 = 70;


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        do {


            Reporter.log("Type grade 1", true);
            grade1 = reader.nextDouble();

            Reporter.log("Type grade 2", true);
            grade2 = reader.nextDouble();
        } while (grade1 < 0 || grade1 > 100 || grade2 < 0 || grade2 > 100);

        Reporter.log("Grades average is: " + (grade1 + grade2) / 2, true);


    }


//    @Test
//
//    public void averageCalculation() {
//
//        double average = ((grade1 + grade2 + grade3 + grade4) / 4);
//        Reporter.log("The average is: " + average, true);
//
//        if (average > 70 && average <= 100) {
//            Reporter.log("You passed with " + average, true);
//
//        } else if (average <= 70 && average >= 0) {
//            Reporter.log("You didn't pass with " + average, true);
//
//        } else if (average < 0 || average > 100) {
//            Reporter.log("The average is an invalid number: " + average, true);
//
//        }
//
//
//    } // End averageCalculation

    public void keyboardAverageCalculation() {

        Scanner reader = new Scanner(System.in);
        Reporter.log("Type grade 1", true);
        grade1 = reader.nextDouble();

        Reporter.log("Type grade 2", true);
        grade2 = reader.nextDouble();

        Reporter.log("Grades average is: " + (grade1 + grade2) / 2, true);


    } // End keyboardAverageCalculation
}
