package com.learnjava;
import java.util.Scanner;
public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        double pi=3.14, r, h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        r = input.nextDouble();
        System.out.print("Enter the height of the cylinder : ");
        h = input.nextDouble();
        double csa = 2*pi*r*h;
        System.out.println("Curved Surface Area Of Cylinder is: "+csa);
    }
}