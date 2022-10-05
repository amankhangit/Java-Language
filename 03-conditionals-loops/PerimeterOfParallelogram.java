package com.learnjava;
import java.util.Scanner;
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        int a, b, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the Parallelogram: ");
        a = input.nextInt();
        System.out.print("Enter the base of the Parallelogram: ");
        b = input.nextInt();
        perimeter = 2*(a+b);
        System.out.println("Perimeter Of Parallelogram is: "+perimeter);
    }
}