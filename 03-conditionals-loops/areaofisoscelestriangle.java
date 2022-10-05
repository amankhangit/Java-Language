package com.learnjava;
import java.util.Scanner;
public class areaofisoscelestriangle {
    public static void main(String[] args) {
        double h, b, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the Isosceles triangle: ");
        h = input.nextDouble();
        System.out.print("Enter the breadth of the Isosceles triangle: ");
        b = input.nextDouble();
        area = h * b * 1/2;
        System.out.println("Area of Isosceles triangle is: "+area);
    }
}