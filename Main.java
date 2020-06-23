package com.company.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter some number: ");
        Scanner numb = new Scanner(System.in);
        int count = numb.nextInt();
        if (count == 1) {
            System.out.println("#");
        } else if (count == 2) {
            System.out.println("#\n##");
        } else if (count == 3) {
            System.out.println("#\n##\n###");
        } else if (count == 4) {
            System.out.println("#\n##\n###\n####");
        } else if (count == 5) {
            System.out.println("#\n##\n###\n####\n#####\n#####");
        } else if (count == 6) {
            System.out.println("#\n##\n###\n####\n#####\n######\n######");
        } else if (count == 7) {
            System.out.println("#\n##\n###\n####\n#####\n######\n#######");
        } else if (count == 8) {
            System.out.println("#\n##\n###\n####\n#####\n######\n#######\n########");
        } else if (count == 9) {
            System.out.println("#\n##\n###\n####\n#####\n######\n#######\n########\n##########");
        } else {
            System.out.println("Please, enter number from 1 to 9!");
        }
    }
}