package com.company.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] userNumbers = new int[3];
        System.out.println("Enter three numbers (press ENTER after each number): ");
        Scanner numb = new Scanner(System.in);

        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = numb.nextInt();

        }
        System.out.println("The MAX Element is: " +
                Math.max(
                        Math.max(userNumbers[0], userNumbers[1]),
                        Math.max(userNumbers[1], userNumbers[2])
                ));

        System.out.println("The MIN Element is: " +
                Math.min(
                        Math.min(userNumbers[0], userNumbers[1]),
                        Math.min(userNumbers[1], userNumbers[2])
                ));

    }
}