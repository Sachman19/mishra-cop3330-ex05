/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Sachin Mishra
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number. ");
        int num1 = input.nextInt();

        System.out.print("Please enter another number. ");
        int num2 = input.nextInt();

        String outAdd = num1 + " + " + num2 + " = " + (num1 + num2);
        String outSub = num1 + " - " + num2 + " = " + (num1 - num2);
        String outMul = num1 + " * " + num2 + " = " + (num1 * num2);
        String outDiv = num1 + " / " + num2 + " = " + (num1 / num2);

        System.out.printf("%s%n%s%n%s%n%s%n", outAdd, outSub, outMul, outDiv);
    }
}
