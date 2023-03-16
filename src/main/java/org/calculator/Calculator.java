package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
//        logger.trace("We've just greeted the user!");
//        logger.debug("We've just greeted the user!");
//        logger.info("We've just greeted the user!");
//        logger.warn("We've just greeted the user!");
//        logger.error("We've just greeted the user!");
//        logger.fatal("We've just greeted the user!");
        logger.info("Starting the Calculator Application.");
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1 = 0.0, number2 = 0.0;
        do {
            logger.info("Showing the operations to the user.");
            System.out.println("################# CALCULATOR DEVOPS #################");
            System.out.println("Operations:");
            System.out.println("1.Square Root");
            System.out.println("2.Factorial");
            System.out.println("3.Natural Log (base e)");
            System.out.println("4.Power");
            System.out.println("Press any other key to Exit.");
            System.out.print("Please Enter Your Choice:");

            int choice;
            try {
                choice = scanner.nextInt();
                logger.info("User's choice is:" + choice);
            } catch (InputMismatchException exception) {
                logger.error("Exception " + exception.getLocalizedMessage() + "has occurred.");
                System.err.println(exception.getLocalizedMessage());
                return;
            }

            switch (choice) {
                case 1:
                    logger.info("Using Square Root Function");
                    System.out.print("\nEnter a number:");
                    try {
                        number1 = scanner.nextDouble();
                        logger.info("User's input for square root function: " + number1);
                    } catch (InputMismatchException exception) {
                        logger.error("Exception: " + exception.getLocalizedMessage() + "has occurred.");
                        System.err.println(exception.getLocalizedMessage());
                    }
                    System.out.println("\nSquare Root of " + number1 + " is : " + calculator.squareRoot(number1));
                    break;

                case 2:
                    logger.info("Using Factorial Function");
                    System.out.print("\nEnter a number:");
                    try {
                        number1 = scanner.nextDouble();
                        logger.info("User's input for factorial function: " + number1);
                    } catch (InputMismatchException exception) {
                        logger.error("Exception: " + exception.getLocalizedMessage() + "has occurred.");
                        System.err.println(exception.getLocalizedMessage());
                    }
                    System.out.println("\nFactorial of " + number1 + " is : " + calculator.factorial(number1));
                    break;

                case 3:
                    logger.info("Using Natural Log Function");
                    System.out.print("\nEnter a number:");
                    try {
                        number1 = scanner.nextDouble();
                        logger.info("User's input for natural log function: " + number1);
                    } catch (InputMismatchException exception) {
                        logger.error("Exception: " + exception.getLocalizedMessage() + "has occurred.");
                        System.err.println(exception.getLocalizedMessage());
                    }
                    System.out.println("\nNatural Log of " + number1 + " is : " + calculator.naturalLog(number1));
                    break;

                case 4:
                    logger.info("Using Power Function");
                    try {
                        System.out.print("\nEnter the number:");
                        number1 = scanner.nextDouble();
                        logger.info("User's input for number: " + number1);
                        System.out.print("\nEnter the power:");
                        number2 = scanner.nextDouble();
                        logger.info("User's input for power: " + number2);
                    } catch (InputMismatchException exception) {
                        logger.error("Exception: " + exception.getLocalizedMessage() + "has occurred.");
                        System.err.println(exception.getLocalizedMessage());
                    }
                    System.out.println("\n " + number1 + " power " + number2 + " is : " + calculator.power(number1, number2));
                    break;

                default:
                    logger.fatal("User exiting the application.");
                    System.out.println("Exit!");
                    return;
            }
        } while (true);
    }

    public double power(double number1, double number2) {
        logger.info("Calculating " + number1 + "^" + number2 + ".");
        double ans = Math.pow(number1, number2);
        logger.info("Answer: " + number1 + "^" + number2 + " = " + ans + ".");
        return ans;
    }

    public double naturalLog(double number1) {
        logger.info("Calculating log(" + number1 + ").");
        double ans = Math.log(number1);
        logger.info("Answer: log(" + number1 + ") = " + ans + ".");
        return ans;
    }

    public double factorial(double number1) {
        logger.info("Calculating factorial of " + number1 + ".");
        double ans = 1;
        for (int i = 1; i <= (int) number1; i++) {
            ans = ans * i;
        }
        logger.info("Answer: " + number1 + "! = " + ans + ".");
        return ans;
    }

    public double squareRoot(double number1) {
        logger.info("Calculating square root of " + number1 + ".");
        double ans = Math.sqrt(number1);
        logger.info("Answer: " + number1 + "^0.5 = " + ans + ".");
        return ans;
    }

}
