package com.learnjava;
import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
        double pi=3.14, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        r = input.nextDouble();
        double volume = (4*pi*r*r*r)/3;
        System.out.println("Volume Of Sphere is: "+volume);
    }
}