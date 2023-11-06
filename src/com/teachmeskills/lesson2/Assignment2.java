package com.teachmeskills.lesson2;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        System.out.println("Enter a two-digit number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = ((n%10)+(n/10)%10);
        System.out.println("Sum of digits of a number = " + sum);
    }

}
