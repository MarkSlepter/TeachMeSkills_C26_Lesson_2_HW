package com.teachmeskills.lesson2;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        System.out.println("Print B");
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        System.out.println("Print C");
        Scanner scany = new Scanner(System.in);
        int C = scany.nextInt();
        int A = ((4 * (B + C - 1)) / 2);
        System.out.println("A = " + A);
    }

}
