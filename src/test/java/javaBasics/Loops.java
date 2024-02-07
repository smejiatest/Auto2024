package javaBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Loops {

    @Test
    public void loops() {

        int index = 0;
        int number = 10;

        for (int i = 0; i <= number; i++) {
            Reporter.log("For index is: " + i, true);

        }

        System.out.println("\n");

        while (index < number) {
            Reporter.log("While index value is: " + index, true);
            index++;

        }


    } // End loops


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);



        //public void conditionalSwitch() {

        reader = new Scanner(System.in);
            Reporter.log("Type the number of a month", true);
            String month = reader.next();
            reader.close();

            switch (month) {

                case "1":
                    Reporter.log("January", true);
                    break;
                case "2":
                    Reporter.log("February", true);
                    break;

                case "3":
                    Reporter.log("March", true);
                    break;

                case "4":
                    Reporter.log("April", true);
                    break;

                case "5":
                    Reporter.log("May", true);
                    break;

                case "6":
                    Reporter.log("June", true);
                    break;

                case "7":
                    Reporter.log("July", true);
                    break;

                case "8":
                    Reporter.log("August", true);
                    break;

                case "9":
                    Reporter.log("September", true);
                    break;

                case "10":
                    Reporter.log("October", true);
                    break;

                case "11":
                    Reporter.log("November", true);
                    break;

                case "12":
                    Reporter.log("December", true);
                    break;

                default:
                    Reporter.log("There's no month for the number typed: " + month, true);

            }
        }

    }


// End class
