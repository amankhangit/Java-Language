package com.learnjava;
import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        double a, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the Equilateral Triangle: ");
        a = input.nextDouble();
        area = (Math.sqrt(3)/4)*(a*a);
        System.out.println("Area Of Equilateral Triangle is: "+area);
    }
}