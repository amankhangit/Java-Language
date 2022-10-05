package com.learnjava;
import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        int a, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the Equilateral Triangle: ");
        a = input.nextInt();
        perimeter = 3 * a;
        System.out.println("Perimeter Of Equilateral Triangle is: "+perimeter);
    }
}