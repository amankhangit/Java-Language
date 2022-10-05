package com.learnjava;
import java.util.Scanner;
public class areaofrectangle {
    public static void main(String[] args) {
        float l, b, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        l = input.nextFloat();
        System.out.print("Enter breadth of the rectangle: ");
        b = input.nextFloat();
        area = l*b;
        System.out.println("Area of rectangle is: "+area);
    }
}