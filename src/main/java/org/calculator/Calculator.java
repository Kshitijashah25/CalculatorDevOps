package org.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1,number2;
        do{
            System.out.println("################# CALCULATOR DEVOPS #################");
            System.out.println("Operations:");
            System.out.println("1.Square Root");
            System.out.println("2.Factorial");
            System.out.println("3.Natural Log (base e)");
            System.out.println("4.Power");
            System.out.println("Press any other key to Exit.");
            System.out.print("Please Enter Your Choice:");

            int choice;
            try{
                choice = scanner.nextInt();
            }catch(InputMismatchException exception){
                System.err.println(exception.getLocalizedMessage());
                return;
            }

            switch(choice){
                case 1 :
                    System.out.print("\nEnter first number:");
                    number1 = scanner.nextDouble();
                    System.out.println("\nSquare Root of "+number1+ " is : " +calculator.squareRoot(number1));
                    break;

                case 2 :
                    System.out.print("\nEnter a number:");
                    number1 = scanner.nextDouble();
                    System.out.println("\nFactorial of "+number1+ " is : " +calculator.factorial(number1));
                    break;

                case 3 :
                    //Square
                    System.out.print("\nEnter a number:");
                    number1 = scanner.nextDouble();
                    System.out.println("\nNatural Log of "+number1+ " is : " +calculator.naturalLog(number1));
                    break;

                case 4 :
                    //Subtraction
                    System.out.print("\nEnter the number:");
                    number1 = scanner.nextDouble();
                    System.out.print("\nEnter the power:");
                    number2 = scanner.nextDouble();
                    System.out.println("\n " +number1+" power "+number2+" is : " +calculator.power(number1,number2));
                    break;

                default:
                    System.out.println("Exit!");
                    return;
            }
        }while(true);
    }

    public double power(double number1, double number2) {
        double ans = Math.pow(number1,number2);
        return ans;
    }

    public double naturalLog(double number1) {
        double ans = Math.log(number1);
        return ans;
    }

    public double factorial(double number1) {
        double ans = 1;
        for(int i = 1 ; i <=(int) number1 ; i++){
        ans = ans * i;
        }
        return ans;
    }

    public double squareRoot(double number1) {
        double ans = Math.sqrt(number1);
        return ans;
    }

}
