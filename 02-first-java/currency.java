package com.learnjava;
import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        float a = input.nextFloat();
        float b = a/80;
        System.out.print(a);
        System.out.println(" INR in $ is: "+b);
    }
}