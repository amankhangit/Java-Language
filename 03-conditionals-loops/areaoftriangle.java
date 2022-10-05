package com.learnjava;
import java.util.Scanner;
public class areaoftriangle {
    public static void main(String[] args) {
        float h, b, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height of the triangle: ");
        h = input.nextFloat();
        System.out.print("Enter Base of the triangle: ");
        b = input.nextFloat();
        area = (h*b)/2;
        System.out.println("Area of triangle is: "+area);
    }
}