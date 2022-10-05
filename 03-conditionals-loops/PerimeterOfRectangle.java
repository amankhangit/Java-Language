package com.learnjava;
import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        int l, b, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle: ");
        l = input.nextInt();
        System.out.print("Enter the breadth of the Rectangle: ");
        b = input.nextInt();
        perimeter = 2*(l+b);
        System.out.println("Perimeter Of Rectangle is: "+perimeter);
    }
}