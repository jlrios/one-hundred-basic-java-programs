package com.jlrd.basic;

import java.util.Scanner;

/**
 * Class:
 * Author: José L. Ríos
 * Creation date: 03/03/24
 * Short description:
 * Updates:
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String myName;

        System.out.print("What is your name: ");
        myName = name.nextLine();
        System.out.println("Nice to meet you " + myName);

        name.close();
    }
}