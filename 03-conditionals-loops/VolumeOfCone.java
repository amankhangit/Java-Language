package com.learnjava;
import java.util.Scanner;
public class VolumeOfCone {
    public static void main(String[] args) {
        double pi=3.14, h, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the base of the cone: ");
        r = input.nextDouble();
        System.out.print("Enter the height of the cone: ");
        h = input.nextDouble();
        double volume = (pi*r*r*h)/3;
        System.out.println("Volume Of Cone is: "+volume);
    }
}