package com.learnjava;
import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        int a, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the Square: ");
        a = input.nextInt();
        perimeter = 4*a;
        System.out.println("Perimeter Of Square is: "+perimeter);
    }
}