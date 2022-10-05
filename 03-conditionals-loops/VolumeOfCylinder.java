package com.learnjava;
import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        double pi=3.14, h, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the base of the cylinder: ");
        r = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        h = input.nextDouble();
        double volume = pi*r*r*h;
        System.out.println("Volume Of Cylinder is: "+volume);
    }
}