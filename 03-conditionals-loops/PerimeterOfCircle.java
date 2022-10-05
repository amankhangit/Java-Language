package com.learnjava;
import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        double r, perimeter, pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r = input.nextDouble();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter Of Circle is: "+perimeter);
    }
}