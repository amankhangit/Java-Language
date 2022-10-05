package com.learnjava;
import java.util.Scanner;
public class PerimeterOfRhombus {
    public static void main(String[] args) {
        int s, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the Rhombus: ");
        s = input.nextInt();
        perimeter = 4*s;
        System.out.println("Perimeter Of Rhombus is: "+perimeter);
    }
}