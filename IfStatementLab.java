/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

public class IfStatementLab {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       JAVA IF STATEMENT LAB");
        System.out.println("======================================\n");

        // PROBLEM 1: AGE CATEGORY CHECKER

        System.out.println("===== AGE CATEGORY CHECKER =====");

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 13) {
            System.out.println("You are a child.");
        } else if (age <= 19) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }

        System.out.println();


        // PROBLEM 2: TEMPERATURE EVALUATOR

        System.out.println("===== TEMPERATURE EVALUATOR =====");

        System.out.print("Enter today's temperature in Celsius: ");
        double temperature = input.nextDouble();

        if (temperature < 0) {
            System.out.println("Freezing point.");
        } else if (temperature <= 25) {
            System.out.println("Normal weather.");
        } else {
            System.out.println("Hot weather.");
        }

        System.out.println();


        // PROBLEM 3: SIMPLE GRADE EVALUATOR

        System.out.println("===== GRADE EVALUATOR =====");

        System.out.print("Enter your test score (0-100): ");
        int grade = input.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade.");
        } else if (grade >= 90) {
            System.out.println("Excellent!");
        } else if (grade >= 75) {
            System.out.println("Good!");
        } else {
            System.out.println("Needs Improvement.");
        }

        System.out.println();


        // PROBLEM 4: CIRCLE CALCULATOR

        System.out.println("===== CIRCLE CALCULATOR =====");

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        if (radius <= 0) {
            System.out.println("Invalid radius.");
        } else {

            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);
        }

        System.out.println();


        // PROBLEM 5: EVEN OR ODD NUMBER

        System.out.println("===== EVEN OR ODD CHECKER =====");

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        System.out.println();

        System.out.println("======================================");
        System.out.println("       PROGRAM COMPLETED!");
        System.out.println("======================================");

        input.close();
    }
}
